import java.util.Scanner;

public class GenerateSpiral {
    static void print(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    static int[][] generateSpiralMat(int n) {
        int[][] mat = new int[n][n];
        int topRow = 0, bottomRow = n - 1, leftCol = 0, rightCol = n - 1;
        int cur = 1;
        while (cur <= n * n) {
            // topRow -> leftCol to rightCol
            for (int j = leftCol; j <= rightCol && cur <= n * n; j++) {
                mat[topRow][j] = cur++;
            }
            topRow++;

            // rightCol -> topRow to bottomRow
            for (int j = topRow; j <= bottomRow && cur <= n * n; j++) {
                mat[j][rightCol] = cur++;

            }
            rightCol--;

            // bottomRow -> rightCol to leftCol
            for (int j = rightCol; j >= leftCol && cur <= n * n; j--) {
                mat[bottomRow][j] = cur++;

            }
            bottomRow--;

            // leftCol -> bottomRow to topRow
            for (int j = bottomRow; j >= topRow && cur <= n * n; j--) {
                mat[j][leftCol] = cur++;

            }
            leftCol++;
        }
        return mat;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt();
        print(generateSpiralMat(n));
        sc.close();
    }
}
