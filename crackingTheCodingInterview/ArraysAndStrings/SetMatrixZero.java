//! if an element in MxN matrix is zero, set it's entire row and column zero
package crackingTheCodingInterview.ArraysAndStrings;

import java.util.Scanner;

public class SetMatrixZero {

    static void print(int[][] mat) {
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[0].length; j++) {
                System.out.print(mat[i][j] + " ");
            }
            System.out.println();
        }
    }

    static void setZeros(int[][] mat) {
        boolean[] rows = new boolean[mat.length];
        boolean[] cols = new boolean[mat[0].length];
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[0].length; j++) {
                if (mat[i][j] == 0) {
                    rows[i] = true;
                    cols[j] = true;
                }
            }
        }
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[0].length; j++) {
                if (rows[i] || cols[j]) {
                    mat[i][j] = 0;
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of rows");
        int row = sc.nextInt();
        System.out.println("Enter number of columns");
        int col = sc.nextInt();
        int mat[][] = new int[row][col];
        System.out.println("Enter " + row * col + " elements");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                mat[i][j] = sc.nextInt();
            }
        }
        print(mat);
        setZeros(mat);
        print(mat);
        sc.close();
    }
}
