import java.util.Scanner;

public class SpiralMat {
    static void print(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    static void printSpiralOrder(int[][] mat, int r, int c) {
        int topRow = 0, bottomRow = r - 1, leftCol = 0, rightCol = c - 1;
        int total = 0;
        while (total < r * c) {
            // topRow -> leftCol to rightCol
            for (int j = leftCol; j <= rightCol && total < r * c; j++) {
                System.out.print(mat[topRow][j] + " ");
                total++;
            }
            topRow++;

            // rightCol -> topRow to bottomRow
            for (int j = topRow; j <= bottomRow && total < r * c; j++) {
                System.out.print(mat[j][rightCol] + " ");
                total++;
            }
            rightCol--;

            // bottomRow -> rightCol to leftCol
            for (int j = rightCol; j >= leftCol && total < r * c; j--) {
                System.out.print(mat[bottomRow][j] + " ");
                total++;
            }
            bottomRow--;

            // leftCol -> bottomRow to topRow
            for (int j = bottomRow; j >= topRow && total < r * c; j--) {
                System.out.print(mat[j][leftCol] + " ");
                total++;
            }
            leftCol++;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter rows and columns");
        int r = sc.nextInt();
        int c = sc.nextInt();
        int total = r * c;
        System.out.println("Enter " + total + " array elements");
        int[][] arr = new int[r][c];
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        printSpiralOrder(arr, r, c);
        sc.close();
    }
}
