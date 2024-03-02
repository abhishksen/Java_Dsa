package Java_Basics;

public class StringBasics {
    public static void main(String[] args) {
        System.out.println("String Basics");
        // string Literal
        String str = "Hello World";
        System.out.println(str);
        // string object
        String str1 = new String("World");
        System.out.println(str1);
        // string length
        System.out.println("Length of the string: " + str.length());
        // string concatenation
        System.out.println(str + " " + str1);
        System.out.println(str.charAt(3));
        System.out.println(str.substring(0, 3));
        System.out.println(str.concat(str1));
        System.out.println(str.equals(str1));
        System.out.println(str.equalsIgnoreCase(str1));
        System.out.println(str.compareTo(str1));
        System.out.println(str.compareToIgnoreCase(str1));
        System.out.println(str.indexOf('l'));
        System.out.println(str.indexOf('l', 3));
        System.out.println(str.toUpperCase());
        System.out.println(str.toLowerCase());
        System.out.println(str.trim());
        System.out.println(str.replace('l', 'w'));
        System.out.println(str.startsWith("He"));
        System.out.println(str.endsWith("lo"));
        System.out.println(str.contains(str1));

        // string buffer
        StringBuffer sb = new StringBuffer("Hello");
        System.out.println(sb.capacity());
        sb.append(" World");
        System.out.println(sb);
        sb.insert(5, " Java");
        System.out.println(sb);
        sb.replace(5, 9, "C++");
        System.out.println(sb);
        sb.delete(5, 9);
        System.out.println(sb);
        sb.reverse();
        System.out.println(sb);
        System.out.println(sb.capacity());
        System.out.println(sb.length());

        // string builder
        StringBuilder sb1 = new StringBuilder("Hello");
        System.out.println("String Builder: " + sb1);
        System.out.println(sb1.capacity());
        System.out.println(sb1.length());
        System.out.println(sb1.append(" World"));
        System.out.println(sb1.insert(5, " Java"));
        System.out.println(sb1.getClass());
        System.out.println(sb1.toString().getClass());
    }
}
