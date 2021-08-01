import java.util.Stack;

public class infTopre {

    static boolean isOperator(char ch) {
        if (Character.isDigit(ch))
            return true;
        else if (ch >= 'a' && ch <= 'z' || ch >= 'A' && ch <= 'Z')
            return true;
        else
            return false;
    }

    static int precedenceOp(char x) {
        if (x == '^')
            return 3;
        else if (x == '*' || x == '/')
            return 2;
        else if (x == '+' || x == '-')
            return 1;
        return -1;
    }

    static String convert(String s) {
        Stack<Character> st = new Stack<>();
        StringBuilder sb = new StringBuilder(s);
        sb.reverse();
        String revStr = sb.toString();
        String prefix = new String("");
        // return sb.toString();
        for (int i = 0; i < revStr.length(); i++) {
            char ch = revStr.charAt(i);
            if (isOperator(ch)) {
                prefix += ch;
            } else if (ch == ')') {
                st.push(ch);
            } else if (ch == '(') {
                while (!st.isEmpty() && st.peek() != ')')
                    prefix += st.pop();
                if (!st.isEmpty())
                    st.pop();
            } else {
                while (!st.isEmpty() && precedenceOp(st.peek()) >= precedenceOp(ch)) {
                    prefix += st.pop();
                }
                st.push(ch);
            }
        }
        while(!st.isEmpty()){
            prefix+=st.pop();
        }
        StringBuilder res = new StringBuilder(prefix);
        res.reverse();
        return res.toString();
    }

    public static void main(String[] args) {
        String s = "(a-b/c)*(a/k-l)";
        System.out.println(convert(s));
    }
}
