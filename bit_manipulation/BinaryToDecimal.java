package bit_manipulation;

import java.util.Scanner;

public class BinaryToDecimal {
    public static int binaryToDecimal(String binary) {
        int len = binary.length();
        int res = 0;
        int pointer = 1;
        for (int i = len - 1; i >= 0; i--) {
            if (binary.charAt(i) == '1') {
                res += pointer;
            }
            pointer *= 2;
        }
        return res;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a binary string: ");
        String binary = sc.next();
        System.out.println("Decimal representation of " + binary + " is: " + Integer.parseInt(binary, 2)); // using
                                                                                                           // Integer.parseInt()
                                                                                                           // method
        System.out.println("Decimal representation of " + binary + " is: " + binaryToDecimal(binary));
        sc.close();
    }
}
