package recursion.basics;

public class CountZeroInNum {
    static int count(int n) {
        if (n == 0)
            return 0;
        int smallAns = count(n / 10);
        return (n % 10 == 0) ? smallAns + 1 : smallAns;
    }

    public static void main(String[] args) {
        int n = 10200400;
        System.out.println(count(n));
    }
}
