package Recursion;

public class removeDup {
    public static String removeDupChar(String arr) {
        if (arr.length() <= 1)
            return arr;
        if (arr.charAt(0) == arr.charAt(1))
            return removeDupChar(arr.substring(1));
        else
            return arr.charAt(0) + removeDupChar(arr.substring(1));
    }

    // public static String removeDupChar(String s) {
    // if (s.length() == 0)
    // return "";
    // char ch = s.charAt(0);
    // String ans = removeDupChar(s.substring(1));

    // if (ch == ans.charAt(0))
    // return ans;
    // return ch + ans;
    // }

    public static void main(String[] args) {
        String arr = "aabcca";
        System.out.println(removeDupChar(arr));
    }
}
