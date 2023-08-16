
import java.util.Scanner;

public class Multiplication {

    static void print(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    static void multiply(int[][] arr1, int[][] arr2, int r1, int c1, int r2, int c2) {

        if (c1 != r2) {
            System.out.println("Matrix multiplication not possible!");
            return;
        }

        int[][] res = new int[r1][c2];
        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c2; j++) {
                for (int k = 0; k < c1; k++) {
                    res[i][j] += arr1[i][k] * arr2[k][j];
                }
            }
        }
        System.out.println("Resultant Matrix after multiplication");
        print(res);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter rows and columns of first matrix");
        int r1 = sc.nextInt();
        int c1 = sc.nextInt();
        System.out.println("Enter first array elements");
        int[][] arr1 = new int[r1][c1];
        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c1; j++) {
                arr1[i][j] = sc.nextInt();
            }
        }

        System.out.println("Enter rows and columns of second matrix");
        int r2 = sc.nextInt();
        int c2 = sc.nextInt();
        System.out.println("Enter second array elements");
        int[][] arr2 = new int[r2][c2];
        for (int i = 0; i < r2; i++) {
            for (int j = 0; j < c2; j++) {
                arr2[i][j] = sc.nextInt();
            }
        }

        multiply(arr1, arr2, r1, c1, r2, c2);

    }
}
