package stack;

public class ArrayImplementaion {
    public static void main(String[] args) {
        Stack stk = new Stack();
        stk.push(10);
        stk.push(20);
        stk.push(30);
        stk.print();
        System.out.println(stk.pop() + " popped from stack");
        System.out.println("Top element is " + stk.peek());
        stk.push(100);
        stk.print();
        System.out.println(stk.isEmpty() ? "Stack is empty" : "Stack is not empty");
    }
}
