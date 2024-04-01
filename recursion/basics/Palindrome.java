package recursion.basics;

public class Palindrome {
    static boolean isPalindrome(int n) {
        // ! using the reverse function from ReverseNumber.java
        return n == ReverseNumber.reverse(n);
    }

    public static void main(String[] args) {
        int n = 12321;
        System.out.println(isPalindrome(n));
    }
}
