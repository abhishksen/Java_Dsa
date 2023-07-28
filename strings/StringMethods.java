package strings;

public class StringMethods {
    public static void main(String[] args) {
        String s3 = new String("Hello world");
        // String s3 = new String("Mello");
        // String s3 = new String("HelloW");

        System.out.println(s3.length());

        System.out.println(s3.charAt(2));

        System.out.println(s3.indexOf('w'));

        // compare strings
        String s4 = "Hello";
        System.out.println(s3.compareTo(s4)); // 0 if equal, -ve if s3 < s4, +ve if s3 > s4 lexicographically

        // contains or not
        String s5 = "Abhishek Sen";
        System.out.println(s5.contains("Abhishek"));
        System.out.println(s5.contains("hish"));
        System.out.println(s5.startsWith("bhi"));
        System.out.println(s5.endsWith("en"));

        System.out.println(s5.toUpperCase());
        System.out.println(s5.toLowerCase());
        System.out.println(s5.concat(s4)); // s5 + s4

        // string integer char
        String s6 = "String";
        s6 += "string";
        s6 += 'a';
        s6 += 10;
        System.out.println(s6);
        System.out.println(s6 + 10 + 20); // s61020
        System.out.println(10 + 20 + s6); // 30s6
        System.out.println(s6 + (10 + 20)); // s630

    }
}
