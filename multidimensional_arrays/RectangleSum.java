import java.util.Scanner;

public class RectangleSum {

    // print function
    static void print(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    // calculate row-wise
    static void findPrefixSumRow(int[][] mat) {
        // traverse horizontaly and calculate row-wize prefix sum
        for (int i = 0; i < mat.length; i++) {
            for (int j = 1; j < mat[i].length; j++) {
                mat[i][j] += mat[i][j - 1];
            }
        }
    }

    // calculate column-wise
    static void findPrefixSumColumn(int[][] mat) {
        // traverse vertically and calculate column-wize prefix sum
        for (int j = 0; j < mat[0].length; j++) {
            for (int i = 1; i < mat.length; i++) {
                mat[i][j] += mat[i - 1][j];
            }
        }
    }

    // calculate row-wise and column-wise
    static void findPrefixSum(int[][] mat) {
        int r = mat.length;
        int c = mat[0].length;
        // traverse horizontaly and calculate row-wize prefix sum
        for (int i = 0; i < r; i++) {
            for (int j = 1; j < c; j++) {
                mat[i][j] += mat[i][j - 1];
            }
        }
        // traverse vertically and calculate column-wize prefix sum
        for (int j = 0; j < c; j++) {
            for (int i = 1; i < r; i++) {
                mat[i][j] += mat[i - 1][j];
            }
        }
    }

    // brute force
    static int squareSum1(int[][] mat, int l1, int r1, int l2, int r2) {
        int sum = 0;
        for (int i = l1; i <= l2; i++) {
            for (int j = r1; j <= r2; j++) {
                sum += mat[i][j];
            }
        }
        return sum;
    }

    // pre calculating the horizontal sum for each row in the matrix
    static int squareSum2(int[][] mat, int l1, int r1, int l2, int r2) {
        int sum = 0;
        findPrefixSumRow(mat);
        for (int i = l1; i <= l2; i++) {
            if (r1 >= 1)
                sum += mat[i][r2] - mat[i][r1 - 1];
            else
                sum += mat[i][r2];
        }
        return sum;
    }

    // optimal solution
    static int squareSum3(int[][] mat, int l1, int r1, int l2, int r2) {
        // int ans = 0;
        int sum = 0, up = 0, left = 0, leftup = 0;

        findPrefixSum(mat);

        // sum = mat[l2][r2];
        if (r1 >= 1)
            left = mat[l2][r1 - 1];
        if (l1 >= 1)
            up = mat[l1 - 1][r2];
        if (l1 >= 1 && r1 >= 1)
            leftup = mat[l1 - 1][r1 - 1];

        sum = mat[l2][r2] - up - left + leftup;
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter rows and columns");
        int r = sc.nextInt();
        int c = sc.nextInt();
        System.out.println("Enter array elements");
        int[][] arr = new int[r][c];
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        // findPrefixSum(arr);
        // print(arr);

        System.out.println("Enter reactangle boundries l1, r1, l2, r2");
        int l1 = sc.nextInt();
        int r1 = sc.nextInt();
        int l2 = sc.nextInt();
        int r2 = sc.nextInt();

        int sum1 = squareSum1(arr, l1, r1, l2, r2);
        int sum2 = squareSum2(arr, l1, r1, l2, r2);
        int sum3 = squareSum3(arr, l1, r1, l2, r2);

        System.out.println(sum1);
        System.out.println(sum2);
        System.out.println(sum3);

        sc.close();
    }
}
