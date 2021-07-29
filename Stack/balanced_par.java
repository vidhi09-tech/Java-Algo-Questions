package Stack;

import java.util.Stack;

public class balanced_par {

    static boolean isValid(String s) {
        Stack<Character> st = new Stack<Character>();
        boolean ans = true;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '{' || s.charAt(i) == '[' || s.charAt(i) == '(')
                st.push(s.charAt(i));
            else if (s.charAt(i) == ')') {
                if (!st.isEmpty() && st.peek() == '(')
                    st.pop();
                else {
                    ans = false;
                    break;
                }
            } else if (!st.isEmpty() && s.charAt(i) == ']') {
                if (st.peek() == '[')
                    st.pop();
                else {
                    ans = false;
                    break;
                }
            } else if (!st.isEmpty() && s.charAt(i) == '}') {
                if (st.peek() == '{')
                    st.pop();
                else {
                    ans = false;
                    break;
                }
            }
        }

        if (st.isEmpty())
            return ans;
        else
            return false;
    }

    public static void main(String[] args) {
        String s = "{([a+b]*[c-d])/e}";

        if (isValid(s))
            System.out.println("Valid String");
        else
            System.out.println("Invalid String");
    }
}
