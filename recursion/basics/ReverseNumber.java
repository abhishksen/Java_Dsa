package recursion.basics;

public class ReverseNumber {
    static int reverse(int n) {
        if (n == 0)
            return 0;
        return (n % 10) * (int) Math.pow(10, (int) Math.log10(n)) + reverse(n / 10);
    }

    public static void main(String[] args) {
        int n = 110190990;
        System.out.println(reverse(n));
    }
}
