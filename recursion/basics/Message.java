package recursion.basics;

public class Message {
    // print message and call itself
    static void message() {
        System.out.println("This is a recursive method.");
        message(); // call itself runs infinitely
    }

    public static void main(String[] args) {
        System.out.println("Hello, Recursion!");
        message(); // run this line to see the output
    }
}
