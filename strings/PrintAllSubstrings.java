package strings;

import java.util.Scanner;

public class PrintAllSubstrings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int len = str.length();
        for (int i = 0; i < len; i++) {
            for (int j = i + 1; j < len + 1; j++) {
                System.out.print(str.substring(i, j) + " ");
            }
        }
        sc.close();
    }
}
