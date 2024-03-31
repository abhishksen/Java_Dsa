//! given two strings,check if one is a permutation of other
package crackingTheCodingInterview.ArraysAndStrings;

import java.util.Arrays;

public class CheckPermutation {
    // by sorting the strings and matching
    static String sortString(String str) {
        char[] charStr = str.toCharArray();
        Arrays.sort(charStr);
        return new String(charStr);
    }

    static boolean matchString(String str1, String str2) {
        if (str1.length() != str2.length())
            return false;
        boolean result = sortString(str1).equals(sortString(str2));
        return result;
    }

    // by counting the characters and matching
    static boolean countAndMatch(String str1, String str2) {
        if (str1.length() != str2.length())
            return false;
        int[] letters = new int[128]; // assumption
        char[] charStr = str1.toCharArray();
        for (char c : charStr) {
            letters[c]++;
        }
        for (int i = 0; i < str2.length(); i++) {
            int c = (int) str2.charAt(i);
            letters[c]--;
            if (letters[c] < 0)
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        String str1 = "abbcdef";
        String str2 = "bcdefab";
        String str3 = "cdef";
        System.out.println(matchString(str1, str2)); // true
        System.out.println(matchString(str2, str3)); // false
        System.out.println(matchString(str1, str3)); // false
        System.out.println(countAndMatch(str1, str2)); // true
        System.out.println(countAndMatch(str2, str3)); // flase
    }
}
