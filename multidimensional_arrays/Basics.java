package multidimensional_arrays;

import java.util.Scanner;

public class Basics {

    static void print(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[][] arr1 = {
                { 1, 2, 3 },
                { 4, 5, 6 },
                { 7, 8, 9 }
        }; // using array literals
        print(arr1);

        System.out.println("Enter rows and columns");
        int rows = sc.nextInt();
        int cols = sc.nextInt();
        System.out.println("Enter array elements");

        int[][] arr2 = new int[rows][cols]; // number of rows are mandatory but not the columns
                                            // total elements = rows*cols
        // taking input in 2d-array
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                arr2[i][j] = sc.nextInt();
            }
        }
        print(arr2);

    }
}
