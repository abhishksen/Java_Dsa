package strings;

public class Equals {
    public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = "Hello";
        String str3 = new String("Hello");
        // "==" checks the address of the object
        System.out.println(str1 == str2); // true
        System.out.println(str1 == str3); // false
        System.out.println(str1.equals(str3)); // true (checks the content)
    }
}
