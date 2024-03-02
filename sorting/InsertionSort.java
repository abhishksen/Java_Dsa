package sorting;

public class InsertionSort {
    static void sort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            int idx = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[idx])
                    idx = j;
            }
            int temp = arr[i];
            arr[i] = arr[idx];
            arr[idx] = temp;
        }
    }

    public static void main(String[] args) {
        System.out.println("Insertion sort");
        int[] arr = { 34, 89, 6, 90, 39, 20 };
        sort(arr);
        for (int i : arr)
            System.out.print(i + " ");
    }
}
