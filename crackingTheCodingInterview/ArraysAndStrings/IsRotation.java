//! given two strings write code to check if s2 is a rotation of s1 or not
package crackingTheCodingInterview.ArraysAndStrings;

public class IsRotation {

    static boolean isRotation(String s1, String s2) {
        int len = s1.length();
        if (len == s2.length() && len > 0) {
            String concat = s1 + s1;
            return concat.contains(s2);
        }
        return false;
    }

    public static void main(String[] args) {
        String s1 = "waterbottle";
        String s2 = "rbottlewate";
        boolean res = isRotation(s1, s2);
        System.out.println(res);
    }
}
