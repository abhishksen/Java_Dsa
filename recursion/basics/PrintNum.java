package recursion.basics;

public class PrintNum {
    static void print(int num) {
        if (num == 0) { // base case
            return;
        }
        print(num - 1); // recursive call with reduced value
        System.out.println(num);
    }

    public static void main(String[] args) {
        print(5);
    }
}
