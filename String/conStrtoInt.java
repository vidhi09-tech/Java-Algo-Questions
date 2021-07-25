package String;

public class conStrtoInt {
    public static int strToInt(String s) {
        int result = 0;
        // If its an -ve no. start with index 1 else 0
        for (int i = s.charAt(0) == '-' ? 1 : 0; i < s.length(); i++) {
            final int digit = s.charAt(i) - '0';
            result = result * 10 + digit;
        }
        return s.charAt(0) == '-' ? -result : result;
    }

    public static String intToStr(int n) {
        boolean isNegative = false;
        if (n < 0)
            isNegative = true;

        StringBuilder s = new StringBuilder();
        do {
            s.append((char) ('0' + Math.abs(n % 10)));
            n /= 10;
        } while (n != 0);
        if (isNegative)
            s.append('-');
        s.reverse();
        return s.toString();
    }

    public static void main(String[] args) {
        String s = "-123";
        int n = -123;
        System.out.println(strToInt(s));
        System.out.println(intToStr(n));
    }
}
