package sorting;

public class BubbleSort {
    static void sort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            boolean swapped = false;
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }
            if (!swapped) {
                break;
            }
        }
    }

    public static void main(String[] args) {
        System.out.println("Bubble sort");
        int[] arr = { 34, 89, 6, 90, 39, 20 };
        sort(arr);
        for (int i : arr)
            System.out.print(i + " ");
    }
}
