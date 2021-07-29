package Stack;

import java.util.Stack;

public class revStack {

    static Stack<Integer> st = new Stack<>();

    static void insert_at_bottom(int x) {
        if (st.isEmpty())
            st.push(x);

        else {
            int a = st.peek();
            st.pop();
            insert_at_bottom(x);
            st.push(a);
        }
    }

    // Reverses the given stack using insert_at_bottom
    static void reverse() {
        if (st.size() > 0) {
            // Hold all items in function
            // Call Stack untill we reach
            // end of the stack
            int x = st.peek();
            st.pop();
            reverse();

            // Insert all items held in function call stack one by one from the bottom to
            // top. Every item is inserted at the bottom
            insert_at_bottom(x);
        }

    }

    public static void main(String[] args) {
        // Pushing elements into the stack
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);
        System.out.println(st);
        // Reverse the elements in the stack
        reverse();

        System.out.println("Reversed Stack");

        System.out.println(st);
    }
}
