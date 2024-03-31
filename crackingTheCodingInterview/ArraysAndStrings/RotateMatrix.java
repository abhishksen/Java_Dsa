//! rotate a NxN square matrix by 90 deg
package crackingTheCodingInterview.ArraysAndStrings;

import java.util.Scanner;

public class RotateMatrix {

    static void print(int[][] mat) {
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[0].length; j++) {
                System.out.print(mat[i][j] + " ");
            }
            System.out.println();
        }
    }

    static void swap(int[][] mat, int i, int j) {
        int temp = mat[i][j];
        mat[i][j] = mat[j][i];
        mat[j][i] = temp;
    }

    static void transpose(int[][] mat) {
        int n = mat.length;
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                swap(mat, i, j);
            }
        }
    }

    static void rotate(int[][] mat) {
        int n = mat.length;
        // ? finding the transpose of the matrix i.e. rows -> columns & columns -> rows
        transpose(mat);
        // ? reversing elements of each row
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n / 2; j++) {
                swap(mat, i, n - 1 - j);
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter dimension of NxN matrix");
        int n = sc.nextInt();
        int mat[][] = new int[n][n];
        System.out.println("Enter " + n * n + " elements");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                mat[i][j] = sc.nextInt();
            }
        }
        print(mat);
        System.out.println("After rotating by 90 deg");
        rotate(mat);
        print(mat);
        sc.close();
    }
}
