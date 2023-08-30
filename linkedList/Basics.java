package linkedList;

public class Basics {

    public static void print(Node head) {
        while (head != null) {
            System.out.print(head.data + " ");
            head = head.next;
        }
    }

    public static void recursivePrint(Node head) {
        if (head == null) {
            return;
        }
        System.out.print(head.data + " ");
        recursivePrint(head.next);
    }

    public static void reversePrint(Node head) {
        if (head == null) {
            return;
        }
        reversePrint(head.next);
        System.out.print(head.data + " ");
    }

    public static int length(Node head) {
        int len = 0;
        while (head != null) {
            len++;
            head = head.next;
        }
        return len;
    }

    public static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    public static void main(String[] args) {
        Node head = new Node(10);
        Node temp1 = new Node(20);
        Node temp2 = new Node(30);
        Node temp3 = new Node(40);
        Node temp4 = new Node(50);
        head.next = temp1;
        temp1.next = temp2;
        temp2.next = temp3;
        temp3.next = temp4;
        System.out.println(head);
        System.out.println(head.data);
        System.out.println(head.next.data);
        System.out.println(head.next.next.data);
        System.out.println(temp2.next);
        System.out.println(temp2.next.data);

        // printing linked list
        Node temp = head;
        for (int i = 1; i <= 5; i++) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }

        System.out.println();

        Node temp5 = new Node(60);
        temp4.next = temp5;

        Node headNode = head;
        while (headNode != null) {
            System.out.print(headNode.data + " ");
            headNode = headNode.next;
        }

        System.out.println();

        print(head);
        System.out.println();
        recursivePrint(head);
        System.out.println();
        reversePrint(head);
        System.out.println();
        System.out.println(length(head));

    }
}
