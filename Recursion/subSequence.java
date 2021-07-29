package Recursion;

public class subSequence {
    static void posSubsequence(String s) {
        if (s.length() <= 1)
            System.out.println(s);
    }

    public static void main(String[] args) {
        String str = "ABC";
        posSubsequence(str);
    }
}
