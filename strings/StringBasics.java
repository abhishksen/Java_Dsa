package strings;

import java.util.*;

public class StringBasics {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // initialization of strings

        String str = "Hello World";
        System.out.println(str);
        String s1 = new String("Hello Java");
        System.out.println(s1);
        String s2 = sc.nextLine(); // scans whole line
        // String s2 = sc.next(); // scans only first word
        System.out.println(s2);
    }
}
