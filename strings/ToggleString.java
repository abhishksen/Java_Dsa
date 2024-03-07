package strings;

import java.util.Scanner;

public class ToggleString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // using StringBuilder
        StringBuilder sb = new StringBuilder(sc.nextLine());
        System.out.println(sb);

        // toggle the string

        for (int i = 0; i < sb.length(); i++) {
            // check -> alphabet - upper or lower
            if (sb.charAt(i) >= 'a' && sb.charAt(i) <= 'z') {
                // lower case
                sb.setCharAt(i, (char) (sb.charAt(i) - 'a' + 'A'));
            } else if (sb.charAt(i) >= 'A' && sb.charAt(i) <= 'Z') {
                // upper case
                sb.setCharAt(i, (char) (sb.charAt(i) - 'A' + 'a'));
            }
        }
        System.out.println(sb);

        // using string to toggle the string
        String str = sc.nextLine();
        StringBuilder sb1 = new StringBuilder(str);
        for (int i = 0; i < sb1.length(); i++) {
            // check -> alphabet - upper or lower
            if (sb1.charAt(i) >= 'a' && sb1.charAt(i) <= 'z') {
                // lower case
                sb1.setCharAt(i, (char) (sb1.charAt(i) - 'a' + 'A'));
            } else if (sb1.charAt(i) >= 'A' && sb1.charAt(i) <= 'Z') {
                // upper case
                sb1.setCharAt(i, (char) (sb1.charAt(i) - 'A' + 'a'));
            }
        }
        System.out.println(sb1);
        sc.close();
    }
}
