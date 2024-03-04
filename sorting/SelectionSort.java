package sorting;

public class SelectionSort {
    static void sort(int[] arr) {
        int n = arr.length;
        for (int i = 1; i < n; ++i) {
            int key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }
    }

    public static void main(String[] args) {
        System.out.println("Selection sort");
        int[] arr = { 34, 89, 6, 90, 39, 20 };
        sort(arr);
        for (int i : arr)
            System.out.print(i + " ");
    }
}
