package bit_manipulation;

public class Functions {
    public static int add(int a, int b) {
        while (b != 0) {
            int carry = a & b;
            a = a ^ b;
            b = carry << 1;
        }
        return a;
    }

    public static int subtract(int a, int b) {
        while (b != 0) {
            int borrow = (~a) & b;
            a = a ^ b;
            b = borrow << 1;
        }
        return a;
    }

    public static int multiply(int a, int b) {
        int result = 0;
        while (b != 0) {
            if ((b & 1) != 0) {
                result = add(result, a);
            }
            a <<= 1;
            b >>= 1;
        }
        return result;
    }

    public static int divide(int a, int b) {
        int quotient = 0;
        int sign = ((a < 0) ^ (b < 0)) ? -1 : 1;
        a = Math.abs(a);
        b = Math.abs(b);
        while (a >= b) {
            a = subtract(a, b);
            quotient = add(quotient, 1);
        }
        return sign * quotient;
    }

    public static int power(int a, int b) {
        int result = 1;
        while (b > 0) {
            if ((b & 1) != 0) {
                result = multiply(result, a);
            }
            a = multiply(a, a);
            b >>= 1;
        }
        return result;
    }

    public static int[] swap(int a, int b) {
        a = a ^ b;
        b = a ^ b;
        a = a ^ b;
        return new int[] { a, b };
    }

    public static void main(String[] args) {
        int a = 5;
        int b = 7;
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("a + b = " + add(a, b));
        System.out.println("a - b = " + subtract(a, b));
        System.out.println("a * b = " + multiply(a, b));
        System.out.println("a / b = " + divide(a, b));
        System.out.println("a ^ b = " + power(a, b));
        System.out.println("a = " + a);
        System.out.println("b = " + b);

        int[] res = swap(9, 10);
        System.out.println("a = " + res[0]);
        System.out.println("b = " + res[1]);
    }
}
