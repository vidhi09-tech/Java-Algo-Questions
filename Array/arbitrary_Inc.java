package Array;

import java.util.*;

public class arbitrary_Inc {

    public static List<Integer> plusOne(List<Integer> A, int n) {
        // Adding 1 to the last digit
        A.set(n, A.get(n) + 1);
        for (int i = n; i > 0 && A.get(i) == 10; --i) {
            A.set(i, 0);
            A.set(i - 1, A.get(i - 1) + 1);
            // System.out.println(A.get(i));
        }

        // If the first element of the list is 10
        if (A.get(0) == 10) {
            // Replace the first element as 0
            A.set(0, 0);
            // Insert 1 at the beginning of the list
            A.add(0, 1);
        }
        return A;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, data;
        System.out.print("Enter the number of elements : ");
        ;
        n = sc.nextInt();

        List<Integer> list = new ArrayList<Integer>();
        for (int i = 0; i < n; i++) {
            data = sc.nextInt();
            list.add(data);
        }
        System.out.println(plusOne(list, n - 1));
        sc.close();
    }
}
