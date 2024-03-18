package hashing;

public class Hashing {
    public static void main(String[] args) {
        System.out.println("Hashing in java");
        // hashing using arrays
        int[] arr = new int[10];
        int[] hash = new int[10];
        int[] a = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        for (int i = 0; i < a.length; i++) {
            int index = a[i] % 10;
            if (arr[index] == 0) {
                arr[index] = a[i];
            } else {
                hash[index] = a[i];
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < hash.length; i++) {
            System.out.print(hash[i] + " ");
        }
    }
}
