package queue;

public class Implementation {
    public static void main(String[] args) {
        Queue queue = new Queue(1000);

        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        queue.enqueue(40);

        System.out.println(queue.dequeue() + " dequeued from queue\n");

        System.out.println("Front item is " + queue.front());

        System.out.println("Rear item is " + queue.rear());

        System.out.println("Queue is empty: " + queue.isEmpty(queue));

        System.out.println("Queue is full: " + queue.isFull(queue));

        System.out.println("Queue size: " + queue.size);

        System.out.println("Queue capacity: " + queue.capacity);

        System.out.println("Queue array: " + queue.array);

        System.out.println("Queue front: " + queue.front);

        System.out.println("Queue rear: " + queue.rear);

        queue.enqueue(55);
        queue.dequeue();
        queue.printQueue();
    }
}
