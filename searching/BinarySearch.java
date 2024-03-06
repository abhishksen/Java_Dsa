package searching;

public class BinarySearch {
    static int search(int[] arr, int key) {
        int l = 0, r = arr.length - 1;
        while (l <= r) {
            int m = l + (r - l) / 2;
            if (arr[m] == key)
                return m;
            if (arr[m] < key)
                l = m + 1;
            else
                r = m - 1;
        }
        return -1;
    }

    static int recursiveSearch(int[] arr, int l, int r, int key) {
        if (r >= l) {
            int m = l + (r - l) / 2;
            if (arr[m] == key)
                return m;
            if (arr[m] > key)
                return recursiveSearch(arr, l, m - 1, key);
            return recursiveSearch(arr, m + 1, r, key);
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = { 9, 10, 45, 55, 89, 230 };
        int res1 = search(arr, 89);
        int res2 = recursiveSearch(arr, 0, arr.length - 1, 230);
        System.out.println(res1);
        System.out.println(res2);
    }
}
