package strings;

public class Performance {
    public static void main(String[] args) {
        String str = "";
        for (int i = 1; i < 10; i++) {
            str += i;  // n new strings will form
            System.out.println(str);
        }
        System.out.println(str);
    }
}
