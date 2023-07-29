package strings;

import java.util.Scanner;

public class ReverseEachWord {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string:");
        String str = sc.nextLine();
        StringBuilder sb = new StringBuilder("");
        String ans = "";
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != ' ') {
                sb.append(str.charAt(i));
            } else {
                ans += sb.reverse().toString() + " "; // it will add upto second last word
                sb = new StringBuilder("");
            }
        }
        ans += sb; // to add the last word
        System.out.println(ans);
    }
}
