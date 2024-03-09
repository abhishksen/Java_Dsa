package stack;

public class StackNode {
    int data;
    StackNode next;

    StackNode() {
        this.next = null;
    }

    StackNode(int data) {
        this.data = data;
        this.next = null;
    }

    StackNode top = null;

    void push(int data) {
        StackNode newNode = new StackNode(data);
        newNode.next = top;
        top = newNode;
    }

    void pop() {
        if (top == null) {
            System.out.println("Stack is empty");
            return;
        }
        top = top.next;
    }

    void display() {
        if (top == null) {
            System.out.println("Stack is empty");
            return;
        }
        StackNode temp = top;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    int peek() {
        if (top == null) {
            System.out.println("Stack is empty");
            return -1;
        }
        return top.data;
    }

    boolean isEmpty() {
        return top == null;
    }
}
