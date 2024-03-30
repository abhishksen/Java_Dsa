package linkedList;

public class DoublyLinkedList {

    Node head;

    public void insertFirst(int val) {
        Node newNode = new Node(val);
        newNode.next = head;
        newNode.prev = null;
        if (head != null) {
            head.prev = newNode;
        }
        head = newNode;
    }

    public void insertLast(int val) {
        Node newNode = new Node(val);
        Node current = head;
        if (head == null) {
            newNode.prev = null;
            head = newNode;
            return;
        }
        while (current.next != null) {
            current = current.next;
        }
        current.next = newNode;
        newNode.prev = current;
    }

    public Node find(int value) {
        Node current = head;
        while (current != null) {
            if (current.val == value) {
                return current;
            }
            current = current.next;
        }
        return null;
    }

    public void insert(int after, int val) {
        Node p = find(after);
        if (p == null) {
            System.out.println("Node not found");
            return;
        }
        Node newNode = new Node(val);
        newNode.next = p.next;
        p.next = newNode;
        newNode.prev = p;
        if (newNode.next != null) {
            newNode.next.prev = newNode;
        }
    }

    // TODO: Implement delete method

    public void display() {
        Node current = head;
        Node last = null;
        while (current != null) {
            System.out.print(current.val + " -> ");
            last = current;
            current = current.next;
        }
        System.out.println("null");
        System.out.println("Reverse: ");
        while (last != null) {
            System.out.print(last.val + " -> ");
            last = last.prev;
        }
        System.out.println("null");
    }

    private class Node {
        int val;
        Node next;
        Node prev;

        public Node(int val) {
            this.val = val;
        }

        // public Node(int val, Node next, Node prev) {
        // this.val = val;
        // this.next = next;
        // this.prev = prev;
        // }
    }

    public static void main(String[] args) {
        DoublyLinkedList list = new DoublyLinkedList();
        list.insertFirst(1);
        list.insertFirst(2);
        list.insertFirst(3);
        list.insertFirst(4);
        list.display();
        list.insertLast(5);
        list.insertLast(6);
        list.display();
        list.insert(3, 7);
        list.insert(7, 40);
        list.insert(78, 100);
        list.display();
    }
}
