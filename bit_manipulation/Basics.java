package bit_manipulation;

public class Basics {

    // check if ith bit is set
    public static boolean isSet(int n, int i) {
        return (n & (1 << i)) != 0; // using left shift operator
    }

    // set the ith bit
    public static int setBit(int n, int i) {
        return n | (1 << i); // using left shift operator
    }

    // clear the ith bit
    public static int clearBit(int n, int i) {
        return n & ~(1 << i); // using left shift operator
    }

    // toggle the ith bit
    public static int toggleBit(int n, int i) {
        return n ^ (1 << i); // using left shift operator
    }

    // update the ith bit
    public static int updateBit(int n, int i, int v) {
        n = clearBit(n, i);
        return n | (v << i); // using left shift operator
    }

    // remove the last(rightmost) set bit
    public static int removeLastSetBit(int n) {
        return n & (n - 1);
    }

    // get the rightmost set bit
    public static int getRightmostSetBit(int n) {
        return n & -n;
    }

    // check if a number is power of 2
    public static boolean isPowerOf2(int n) {
        return n != 0 && (n & (n - 1)) == 0;
    }

    // count the number of set bits
    public static int countSetBits(int n) {
        int count = 0;
        while (n > 0) {
            n = n & (n - 1);
            count++;
        }
        return count;
    }

    public static void main(String[] args) {
        int n = 5;
        int i = 2;
        System.out.println(isSet(n, i)); // true
        System.out.println(setBit(n, i)); // 5
        System.out.println(clearBit(n, i)); // 1
        System.out.println(toggleBit(n, i)); // 1
        System.out.println(updateBit(n, i, 1)); // 5
        System.out.println(removeLastSetBit(n)); // 4
        System.out.println(getRightmostSetBit(n)); // 1
        System.out.println(isPowerOf2(n)); // false
        System.out.println(countSetBits(n)); // 2
    }
}
