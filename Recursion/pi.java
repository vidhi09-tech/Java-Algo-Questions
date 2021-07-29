package Recursion;

public class pi {

    String replacePI(String s) {
        // Base Case
        // If the string is empty or of length 1
        if (s.length() == 0)
            return s;

        // If the first two character is "pi" then replace with 3.14
        if (s.charAt(0) == 'p' && s.charAt(1) == 'i' && s.length() >= 2)
            return "3.14" + replacePI(s.substring(2, s.length()));

        // If the first character is not 'p' then just put that character in front of
        // the answer which came from recursion
        return s.charAt(0) + replacePI(s.substring(1, s.length()));
    }

    public static void main(String[] args) {
        pi p = new pi();
        String str = "pippppiiiipi";
        System.out.println(p.replacePI(str));
    }
}
