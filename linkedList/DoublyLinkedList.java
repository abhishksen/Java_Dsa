package linkedList;

public class DoublyLinkedList {
    Node head;

    private class Node {
        int val;
        Node next;
        Node prev;

        Node(int val) {
            this.val = val;
        }

        Node(int val, Node next, Node prev) {
            this.val = val;
            this.next = next;
            this.prev = prev;
        }
    }

    void insertAtStart(int val) {
        Node newNode = new Node(val);
        newNode.next = head;
        if (head != null) {
            head.prev = newNode;
        }
        head = newNode;
    }

    void insertAtEnd(int val) {
        Node newNode = new Node(val);
        if (head == null) {
            head = newNode;
            return;
        }
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
        newNode.prev = temp;
    }

    void insertAtPos(int val, int pos) {
        Node newNode = new Node(val);
        if (pos == 0) {
            newNode.next = head;
            if (head != null) {
                head.prev = newNode;
            }
            head = newNode;
            return;
        }
        Node temp = head;
        for (int i = 0; i < pos - 1; i++) {
            if (temp == null) {
                System.out.println("Position not found");
                return;
            }
            temp = temp.next;
        }
        if (temp == null) {
            System.out.println("Position not found");
            return;
        }
        newNode.next = temp.next;
        if (temp.next != null) {
            temp.next.prev = newNode;
        }
        temp.next = newNode;
        newNode.prev = temp;
    }

    void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.val);
            if (temp.next != null)
                System.out.print(" -> ");
            temp = temp.next;
        }
        System.out.println();
    }

    // driver code
    public static void main(String[] args) {
        DoublyLinkedList dl = new DoublyLinkedList();
        dl.insertAtStart(0);
        dl.insertAtStart(20);
        dl.display();
        dl.insertAtEnd(30);
        dl.insertAtEnd(40);
        dl.display();
        dl.insertAtPos(10, 0);
        dl.insertAtPos(15, 2);
        dl.display();

    }

}
