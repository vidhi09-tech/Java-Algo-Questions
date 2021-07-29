package Recursion;

public class reverse {
    static void revString(String name) {
        // Base Case
        if (name.length() <= 0)
            System.out.println(name);
        // Recursive Case
        else {
            System.out.print(name.charAt(name.length() - 1));
            revString(name.substring(0, name.length() - 1));
        }
    }

    public static void main(String[] args) {
        String name = "Hello";
        revString(name);
    }
}
