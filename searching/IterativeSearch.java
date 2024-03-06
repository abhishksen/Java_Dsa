package searching;

public class IterativeSearch {
    static int search(int[] arr, int key) {
        int idx = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                idx = i;
                return idx;
            }
        }
        return idx;
    }

    public static void main(String[] args) {
        int[] arr = { 23, 45, 10, 55, 40, 9 };
        int res = search(arr, 9);
        System.out.println(res);
    }
}
