package linkedList;

public class Implementation {

    // declaring a Node
    public static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    // Linked list class
    public static class LL {
        Node head;
        Node tail;

        // checking empty
        boolean isEmpty() {
            if (head == null) {
                return true;
            } else {
                return false;
            }
        }

        // calculating size
        int size() {
            int count = 0;
            Node temp = head;
            while (temp != null) {
                count++;
                temp = temp.next;
            }
            return count;
        }

        // insertion at tail
        void insertAtEnd(int data) {
            Node node = new Node(data);
            if (head == null) {
                head = node;
            } else {
                tail.next = node;
            }
            tail = node;
        }

        // insertion at head
        void insertAtStart(int data) {
            Node node = new Node(data);
            if (isEmpty()) {
                // head = node;
                // tail = node;
                insertAtEnd(data);
            } else {
                node.next = head;
                head = node;
            }
        }

        void insertAtN(int index, int data) {
            Node node = new Node(data);
            Node temp = head;

            if (isEmpty()) {
                return;
            }
            for (int i = 0; i < index - 1; i++) {
                temp = temp.next;
            }
            node.next = temp.next;
            temp.next = node;
        }

        // displaying the linkedList
        void display() {
            Node temp = head;
            while (temp != null) {
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
            System.out.println();
        }
    }

    // main method class
    public static void main(String[] args) {
        LL list = new LL();
        System.out.println(list.isEmpty());
        System.out.println(list.size());
        list.insertAtStart(0);
        list.insertAtEnd(9);
        list.insertAtEnd(10);
        list.insertAtEnd(7);
        list.display();
        System.out.println(list.isEmpty());
        System.out.println(list.size());
        list.insertAtStart(23);
        list.insertAtEnd(34);
        list.display();
        list.insertAtStart(3);
        list.display();
        list.insertAtN(3, 45);
        list.display();
    }
}
