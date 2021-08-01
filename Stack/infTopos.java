import java.util.Stack;

/**
 * infTopos
 */
public class infTopos {

    static boolean isOperand(char x) {
        if (Character.isDigit(x))
            return true;
        else if (x >= 'a' && x <= 'z' || x >= 'A' && x <= 'Z')
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

    static String convert(String infix) {
        Stack<Character> st = new Stack<>();
        String postfix = new String("");

        for (int i = 0; i < infix.length(); i++) {
            char ch = infix.charAt(i);
            // If operand add the character to the string
            if (isOperand(ch)) {
                postfix += ch;
            } 
            // If '(' push to stack
            else if (ch == '(') {
                st.push(ch);
            } 
            // If ')' pop from the stack until '(' is found
            else if (ch == ')') {
                while (!st.isEmpty() && st.peek() != '(') {
                    postfix += st.pop();
                }
                if(!st.isEmpty())
                st.pop();
            }
            else{
                // If operator 
                // Pop from the stack and add to the string until an operator with less precedence is found
                while(!st.isEmpty() && precedenceOp(st.peek())>precedenceOp(ch)){
                    postfix+=st.pop();
                }
                st.push(ch);
            }
        }
        while(!st.empty()){
            postfix+=st.pop();
        }
        return postfix;
    }

    public static void main(String[] args) {
        String s = "a+b*c-d/e";
        // (a-b/c)*(a/k-l)
        String res = convert(s);
        System.out.println(res);
    }
}