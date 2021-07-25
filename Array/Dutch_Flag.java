package Array;

public class Dutch_Flag {

    static void swap(int arr[], int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    static void sortArr(int arr[], int n) {
        int mid, low, high;
        mid = low = 0;
        high = n - 1;

        while (mid <= high) {
            switch (arr[mid]) {
            case 0:
                swap(arr, low, mid);
                low++;
                mid++;
                break;

            case 1:
                mid++;
                break;

            case 2:
                swap(arr, mid, high);
                high--;
                break;
            }
        }
    }

    static void printArr(int arr[], int n) {
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int arr[] = { 0, 1, 2, 1, 0, 2, 2, 0 };
        int n = arr.length;

        System.out.print("Array Before Sorting : ");
        printArr(arr, n);

        // Sorting the array
        sortArr(arr, n);

        System.out.print("Array after sorting: ");
        printArr(arr, n);
    }
}