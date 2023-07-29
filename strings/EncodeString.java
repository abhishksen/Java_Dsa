package strings;

import java.util.Scanner;

public class EncodeString {

    public static String encode(String str) {
        String ans = "" + str.charAt(0);
        int count = 1;
        for (int i = 1; i < str.length(); i++) {
            char cur = str.charAt(i);
            char prev = str.charAt(i - 1);
            if (cur == prev) {
                count++;
            } else {
                if (count > 1) {
                    ans += count;
                }
                count = 1;
                ans += cur;
            }
        }
        if (count > 1) {
            ans += count;
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(encode(str));
    }
}
