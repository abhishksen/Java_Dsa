// implement an algorithm to determine if a string has all unique characters.
package crackingTheCodingInterview.ArraysAndStrings;

public class IsUnique {
    // ASCII values 128 characters
    static boolean IsAllUnique(String str) {
        if (str.length() > 128)
            return false;
        boolean[] charSet = new boolean[128];
        for (int i = 0; i < str.length(); i++) {
            int val = str.charAt(i);
            if (charSet[val])
                return false;
            charSet[val] = true;
        }
        return true;
    }

    public static void main(String[] args) {
        String str1 = "abcdef";
        String str2 = "abcdefghab ghj";
        String str3 = "abcdefgha4364578 56";
        System.out.println(IsAllUnique(str1));
        System.out.println(IsAllUnique(str2));
        System.out.println(IsAllUnique(str3));
    }
}
