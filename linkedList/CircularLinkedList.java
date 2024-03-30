package linkedList;

public class CircularLinkedList {

    private Node head;
    private Node tail;

    public CircularLinkedList() {
        this.head = null;
        this.tail = null;
    }

    public void insert(int val) {
        Node newNode = new Node(val);
        if (head == null) {
            head = newNode;
            tail = newNode;
            return;
        }
        tail.next = newNode;
        newNode.next = head;
        tail = newNode;
    }

    public void delete(int val) {
        Node current = head;
        if (current == null) {
            return;
        }
        if (current.val == val) {
            head = head.next;
            tail.next = head;
            return;
        }
        do {
            Node next = current.next;
            if (next.val == val) {
                current.next = next.next;
                break;
            }
            current = current.next;
        } while (current != head);
    }

    public void display() {
        Node current = head;
        if (head != null) {
            do {
                System.out.print(current.val + " -> ");
                current = current.next;
            } while (current != head);
        }
        System.out.println("HEAD");
    }

    private class Node {
        int val;
        Node next;

        public Node(int val) {
            this.val = val;
        }
    }

    public static void main(String[] args) {
        CircularLinkedList cll = new CircularLinkedList();
        cll.insert(1);
        cll.insert(2);
        cll.insert(3);
        cll.insert(4);
        cll.insert(5);
        cll.display();
        cll.delete(3);
        cll.display();
        cll.delete(1);
        cll.display();
        cll.delete(15);
    }

}
