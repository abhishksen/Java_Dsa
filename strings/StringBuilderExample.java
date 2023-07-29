package strings;

public class StringBuilderExample {
    public static void main(String[] args) {

        // stringbuilder works in character array internally
        // constructors of StringBuilder class
        // StringBuilder(); // default constructor
        // StringBuilder(String str); // constructor with string
        // StringBuilder(int capacity); // constructor with capacity

        StringBuilder sb = new StringBuilder("Hello");
        // string builder methods
        sb.append(" world");
        sb.append(77);
        sb.append(77.90);
        char[] ch = { 'a', '8', '@' };
        sb.append(ch);
        System.out.println(sb);
        sb.setCharAt(0, 'M');
        sb.setCharAt(8, 'A');
        System.out.println(sb);

        // insert method
        sb.insert(8, "Hello");
        sb.insert(0, 'A');
        System.out.println(sb);

        // delete method
        sb.delete(8, 13);
        System.out.println(sb);

        sb.deleteCharAt(sb.length() - 1);
        System.out.println(sb);

        // reverse method
        sb.reverse();
        System.out.println(sb);

        // substring method
        System.out.println(sb.substring(8));

    }
}
