package recursion.basics;

public class Printnum2 {
    // ? Print numbers from num to 1 using recursion
    static void print(int n) {
        if (n == 0)
            return;
        System.out.println(n); // print the number
        print(n - 1); // recursive call with reduced value after printing
    }

    public static void main(String[] args) {
        print(7);
    }
}
