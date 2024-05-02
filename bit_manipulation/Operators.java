package bit_manipulation;

public class Operators {
    public static void main(String[] args) {
        int a = 5; // 101
        int b = 7; // 111
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("a & b = " + (a & b)); // 101 & 111 = 101 = 5
        System.out.println("a | b = " + (a | b)); // 101 | 111 = 111 = 7
        System.out.println("a ^ b = " + (a ^ b)); // 101 ^ 111 = 010 = 2
        System.out.println("~a = " + (~a)); // ~101 = 11111111111111111111111111111010 = -6
        System.out.println("a << 1 = " + (a << 1)); // 101 << 1 = 1010 = 10
        System.out.println("a >> 1 = " + (a >> 1)); // 101 >> 1 = 10 = 2
        System.out.println("a >>> 1 = " + (a >>> 1)); // 101 >>> 1 = 10 = 2
    }
}
