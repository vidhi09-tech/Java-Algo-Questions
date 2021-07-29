package Stack;

public class usingLL {

    static StackNode head;

    static class StackNode {
        int data;
        StackNode next;

        StackNode(int data) {
            this.data = data;
        }
    }

    public boolean isEmpty() {
        if (head == null)
            return true;
        else
            return false;
    }

    public void push(int data) {
        StackNode newNode = new StackNode(data);
        if (head == null)
            head = newNode;
        else {
            StackNode temp = head;
            head = newNode;
            newNode.next = temp;
        }
        System.out.println(data + " pushed to stack");
    }

    public int pop() {
        int popped = 0;
        if (head == null)
            System.out.println("Stack is empty");
        else {
            popped = head.data;
            head = head.next;
        }
        return popped;
    }

    public int peek() {
        if (head == null) {
            System.out.println("Stack is empty");
            return -1;
        } else {
            return head.data;
        }
    }

    public static void main(String[] args) {
        usingLL ll = new usingLL();
        ll.push(10);
        ll.push(20);
        ll.push(30);

        System.out.println(ll.pop() + " popped from the stack");

        System.out.println("Top element is " + ll.peek());
    }
}