package strings;

public class Interning {
    public static void main(String[] args) {
        String str = "Hello";
        String gtr = "Hello";
        gtr = "Bye";
        System.out.println(str == gtr); // false
    }
}
