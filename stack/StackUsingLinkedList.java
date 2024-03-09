package stack;

public class StackUsingLinkedList {

    public static void main(String[] args) {
        StackNode stack = new StackNode();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.display();
        System.out.println("Stack is empty: " + stack.isEmpty());
        stack.pop();
        stack.display();
        System.out.println(stack.peek());
    }
}
