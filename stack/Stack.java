package stack;

public class Stack {
    final static int MAX = 1000;
    int top = -1;
    int[] stk = new int[MAX];

    Stack() {
        top = -1;
    }

    boolean isEmpty() {
        return (top < 0);
    }

    boolean push(int x) {
        if (top >= (MAX - 1)) {
            System.out.println("Stack Overflow");
            return false;
        } else {
            stk[++top] = x;
            System.out.println(x + " pushed into stack");
            return true;
        }
    }

    int pop() {
        if (top < 0) {
            System.out.println("Stack Underflow");
            return 0;
        } else {
            int x = stk[top--];
            return x;
        }
    }

    int peek() {
        if (top < 0) {
            System.out.println("Stack Underflow");
            return 0;
        } else {
            int x = stk[top];
            return x;
        }
    }

    void print() {
        if (top < 0) {
            System.out.println("Stack is empty");
            return;
        }
        System.out.println("Stack elements are:");
        for (int i = top; i >= 0; i--) {
            System.out.print(stk[i] + " ");
        }
        System.out.println();
    }

}
