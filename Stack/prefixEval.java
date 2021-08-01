import java.util.Stack;

public class prefixEval {
     static int prefixEvaluation(String s){
         Stack<Integer> st = new Stack<>();

         for (int i = s.length()-1; i>=0; i--) {
             char ch=s.charAt(i);
             if(Character.isDigit(ch))
             {
                 st.push(ch-'0');
             }
             else
             {
                 int b=st.pop();
                 int a=st.pop();

                //  System.out.println(a+" "+b);
                switch (ch) {
                    case '+':
                        st.push(b+a);
                        break;
                    case '-':
                        st.push(b-a);
                        break;
                    case '*':
                        st.push(b*a);
                        break;
                    case '/':
                        st.push(b/a);
                        break;
                    default:
                        break;
                }
             }
         }
         return st.pop();
    }
 public static void main(String[] args) {
    System.out.println(prefixEvaluation("-+7*45+20"));
 }   
}
