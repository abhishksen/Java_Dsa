//! compress string using the counts of the repeated characters
package crackingTheCodingInterview.ArraysAndStrings;

import java.util.Scanner;

public class CompressString {
    static String compress(String str) {
        int len = str.length();
        int count = 0;
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < len; i++) {
            count++;
            if (i + 1 >= len || str.charAt(i) != str.charAt(i + 1)) {
                sb.append(str.charAt(i));
                sb.append(count);
                count = 0;
            }
        }
        return sb.length() < len ? sb.toString() : str;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter string to compress: ");
        String str = sc.nextLine();
        String res = compress(str);
        System.out.println(res);
        sc.close();
    }
}
