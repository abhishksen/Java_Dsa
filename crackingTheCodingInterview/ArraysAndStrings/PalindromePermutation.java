//! Given a string check if it is a permutation of a palindrome. 
//? The palindrome does not need to be limited to just dictionary words
package crackingTheCodingInterview.ArraysAndStrings;

public class PalindromePermutation {
    public static int getCharNumber(Character val) {
        int a = Character.getNumericValue('a');
        int z = Character.getNumericValue('z');
        if (a <= val && val <= z) {
            return val - a;
        }
        return -1;
    }

    public static int[] charFreqArray(String str) {
        int[] table = new int[Character.getNumericValue('z') - Character.getNumericValue('a') + 1];
        for (char c : str.toCharArray()) {
            int x = getCharNumber(c);
            if (x != -1)
                table[x]++;
        }
        return table;
    }

    static boolean checkMaxOneOdd(int[] table) {
        boolean founded = false;
        for (int count : table) {
            if (count % 2 == 1) {
                if (founded)
                    return false;
                founded = true;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String str = "taco cato";
        int table[] = charFreqArray(str);
        boolean ans = checkMaxOneOdd(table);
        System.out.println(ans);
    }
}
