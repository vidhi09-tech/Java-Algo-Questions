import java.util.Stack;

/**
 * prefixEval
 */
public class postfixEval {

    static int postfixEvaluation(String s){
        Stack<Integer> st = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char ch=s.charAt(i);
            if(Character.isDigit(ch)){
                st.push(ch-'0');
                // System.out.println(x);
            }
            else{
                int val2=st.pop();
                int val1=st.pop();
                
                switch (ch) {
                    case '+':
                        st.push(val2+val1);
                        break;
                    case '-':
                        st.push(val1-val2);
                        break;
                    case '*':
                        st.push(val2*val1);
                        break;
                    case '/':
                        st.push(val1/val2);
                        break;
                    default:
                        break;
                }
                // System.out.println(st);
            }
        }
        return st.pop();
    }

    public static void main(String[] args) {
        String s = "35*62/+4-";
        int res = postfixEvaluation(s);
        System.out.println(res);
    }
}