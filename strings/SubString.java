package strings;

public class SubString {
    public static void main(String[] args) {

        // substring -> continueous part of string
        String s = "Abhishek";
        System.out.println(s.substring(2));
        System.out.println(s.substring(2, 5));

        for (int i = 2; i < 5; i++) {
            System.out.print(s.substring(i));
        }
    }
}
