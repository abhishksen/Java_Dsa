package sorting;

import java.util.ArrayList;

public class MergeSort {
    static void merge(int[] arr, int l, int m, int r) {
        ArrayList<Integer> temp = new ArrayList<>();
        int left = l;
        int right = m + 1;

        while (left <= m && right <= r) {
            if (arr[left] <= arr[right]) {
                temp.add(arr[left]);
                left++;
            } else {
                temp.add(arr[right]);
                right++;
            }
        }

        while (left <= m) {
            temp.add(arr[left]);
            left++;
        }
        while (right <= r) {
            temp.add(arr[right]);
            right++;
        }

        for (int i = l; i <= r; i++) {
            arr[i] = temp.get(i - l);
        }

    }

    static void mergeSort(int[] arr, int l, int r) {
        int low = l;
        int high = r;
        if (low >= high) {
            return;
        }
        int mid = (low + high) / 2;
        mergeSort(arr, low, mid);
        mergeSort(arr, mid + 1, high);
        merge(arr, low, mid, high);
    }

    public static void main(String[] args) {
        System.out.println("Merge sort");
        int[] arr = { 34, 89, 6, 90, 39, 20 };
        int n = arr.length;
        mergeSort(arr, 0, n - 1);
        for (int i : arr)
            System.out.print(i + " ");
    }
}
