package strings;

import java.util.Scanner;

public class PalindromicSubString {

    public static boolean checkPalindrome(String str) {
        int i = 0;
        int j = str.length() - 1;
        while (i < j) {
            if (str.charAt(i) != str.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }

    public static int countPalindromicSubString(String str) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            for (int j = i + 1; j <= str.length(); j++) {
                String subString = str.substring(i, j);
                if (checkPalindrome(subString)) {
                    System.out.print(subString + " ");
                    count++;
                }
            }
        }
        System.out.println();
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // String str = "abccba";
        String str = sc.nextLine();
        System.out.println(checkPalindrome(str));
        System.out.println(countPalindromicSubString(str));
        sc.close();
    }
}
