package recursion.basics;

public class PrintNum {
    // ? Print numbers from 1 to num using recursion
    static void print(int num) {
        if (num == 0) { // base case
            return;
        }
        print(num - 1); // recursive call with reduced value before printing
        System.out.println(num); // print the number
    }

    public static void main(String[] args) {
        print(5);
    }
}
