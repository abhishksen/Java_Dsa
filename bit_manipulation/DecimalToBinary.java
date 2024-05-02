package bit_manipulation;

import java.util.Scanner;

public class DecimalToBinary {
    public static String decimalToBinary(int n) {
        StringBuilder binary = new StringBuilder();
        while (n > 0) {
            binary.append(n % 2);
            n /= 2;
        }
        return binary.reverse().toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a decimal number: ");
        int n = sc.nextInt();
        System.out.println("Binary representation of " + n + " is: " + decimalToBinary(n));
        sc.close();
    }
}
