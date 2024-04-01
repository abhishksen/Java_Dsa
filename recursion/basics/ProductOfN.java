package recursion.basics;

//? Print the product of numbers from 1 to n using recursion (factorial program)
public class ProductOfN {
    static int product(int n) {
        if (n == 1)
            return 1;
        return n * product(n - 1);
    }

    public static void main(String[] args) {
        System.out.println(product(5));
    }
}
