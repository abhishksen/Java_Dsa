package Collections_Framework;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Deque;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Set;
import java.util.Stack;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.Vector;

public class CollectionsFramework {
    public static void main(String[] args) {
        System.out.println("Hello World");
        // collections framework
        // Iterable interface =>
        // collection => list, queue, set
        // Iterator
        // Collection
        // Arrays
        // Comparator
        // <Wrapper Class> => Generics

        // lsit interface => values stored in ordered manner with duplicate allowed
        List<Integer> list = new ArrayList<>();
        // List <Integer> list = new ArrayList<Integer>(); => both are same
        list.add(10);
        list.add(15);
        list.add(17);
        list.add(1, 11);
        // list.add("Abhishek"); it will throw an error bcoz the type specified is
        // integer type
        System.out.println("List " + list);

        // ArrayList => typical array structure => non-synchronized thread unsafe
        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(5);
        list1.add(1, 67);
        System.out.println("ArrayList " + list1);

        // LinkedList => linking values
        List<Integer> linkedList = new LinkedList<Integer>();
        linkedList.add(29);
        linkedList.add(0, 9);
        linkedList.add(56);
        int size = linkedList.size();
        System.out.println("LinkedList " + linkedList + " Size " + size);

        // vector => synchronized list => thread safe => slower than arraylist
        Vector<String> vector = new Vector<String>();
        vector.add("7");
        vector.add("Abhishek");
        vector.add("Bokaro");
        vector.add("String type");
        System.out.println(vector);
        vector.clear(); // removing all the elements
        System.out.println(vector);

        // Stack => LIFO(Last In First Out) extends the vector class
        // operations => push(), pop(), peek()
        Stack<Integer> stack = new Stack<Integer>();
        stack.push(23);
        stack.push(33);
        stack.push(29);
        stack.push(2);
        System.out.println("Stack " + stack);
        System.out.println("Top element " + stack.peek());
        stack.pop();
        System.out.println("Modified Stack" + stack);

        // Queue => FIFO(First In First Out) interface
        // operations => offer(), peek(), poll()
        Queue<Integer> queue = new LinkedList<Integer>(); // using linkedList
        queue.add(8);
        queue.offer(7);
        queue.offer(79); // adding new elements , offering at the last
        queue.add(89);
        System.out.println("Queue " + queue);
        System.out.println("Queue remove " + queue.remove());
        System.out.println("Queue poll " + queue.poll()); // removing elements from first
        System.out.println("Updated Queue " + queue);
        System.out.println("Queue peek " + queue.peek());

        // PriorityQueue => by default min heap creation
        PriorityQueue<Integer> minHeap = new PriorityQueue<Integer>();
        minHeap.offer(45);
        minHeap.add(6);
        minHeap.add(9);
        minHeap.offer(38);
        System.out.println("PriorityQueue minheap " + minHeap);
        minHeap.add(3);
        System.out.println("PriorityQueue minheap" + minHeap);
        System.out.println("PriorityQueue minheap peek " + minHeap.peek());

        // priorityQueue => creating maxHeap using comparator.reverseOrder()
        PriorityQueue<Integer> maxHeap = new PriorityQueue<Integer>(Comparator.reverseOrder());
        maxHeap.offer(45);
        maxHeap.add(6);
        maxHeap.add(9);
        maxHeap.offer(38);
        System.out.println("PriorityQueue maxHeap " + maxHeap);
        maxHeap.add(78);
        System.out.println("PriorityQueue maxHeap " + maxHeap);
        System.out.println("PriorityQueue maxHeap peek " + maxHeap.peek());

        // Dequeue => interface
        // ArrayDeQueue
        // Deque => operation can be performed in both the end of the queue
        Deque<Integer> adq = new ArrayDeque<Integer>();
        adq.offer(10);
        adq.offer(20);
        adq.offerFirst(30);
        adq.offerLast(40);
        System.out.println("ArrayDeque " + adq);
        adq.pollFirst();
        adq.poll(); // same as poll first
        adq.pollLast();
        System.out.println("Modified ArrayDeque" + adq);

        // Set Interface => unordered collection and doesn't allow duplicate values
        // HashSet => unordered and unique values
        Set<Integer> set = new HashSet<Integer>();
        set.add(5);
        set.add(90);
        set.add(35);
        set.add(35); // duplicacy not allowed
        set.add(54);
        set.add(70);
        System.out.println("HashSet " + set);

        // LinkedHashSet = ordered and unique values
        LinkedHashSet<Integer> linkedHashSet = new LinkedHashSet<Integer>();
        linkedHashSet.add(67);
        linkedHashSet.add(7);
        linkedHashSet.add(6);
        linkedHashSet.add(6); // no duplicacy allowed
        linkedHashSet.add(9);
        System.out.println("LinkedHasSet " + linkedHashSet);
        System.out.println("Is 7 present? " + linkedHashSet.contains(7));

        // SortedSet => interface which extends the set interface
        // TreeSet => directly implements sortedSet not the set interface unique &
        // sorted order set
        TreeSet<Integer> treeSet = new TreeSet<Integer>();
        treeSet.add(90);
        treeSet.add(67);
        treeSet.add(67); // no duplicacy allowed
        treeSet.add(89);
        treeSet.add(55);
        treeSet.add(6);
        System.out.println("TreeSet " + treeSet);
        System.out.println(treeSet.tailSet(89));
        System.out.println(treeSet.ceiling(67));
        System.out.println(treeSet.isEmpty());

        // Map interface key(unique), value(may be more than one) & key-value pairs
        // HashMap => unsorted key values
        HashMap<String, Integer> hmap = new HashMap<String, Integer>();
        hmap.put("Second", 20);
        hmap.put("First", 2);
        System.out.println("HashMap " + hmap);

        // TreeMap => sorted key values
        TreeMap<String, Integer> tmap = new TreeMap<String, Integer>();
        tmap.put("Second", 20);
        tmap.put("First", 2);
        System.out.println("TreeMap " + tmap);
        System.out.println(tmap.get("First"));
        System.out.println(tmap.keySet()); // only give the keyset
        System.out.println(tmap.values()); // values
        System.out.println(tmap.size()); // give the size
        System.out.println(tmap.toString()); // produce a string of the set
        System.out.println(tmap.getClass()); // give the class name

        // sorting arrays using Arrays.sort() method
        int[] arr = { 1, 4, 5, 67, 9, 8, 7, 2 };
        for (int e : arr) {
            System.out.print(e + " ");
        }
        System.out.println();
        Arrays.sort(arr);
        for (int e : arr) {
            System.out.print(e + " ");
        }
        System.out.println();

        // Searching an element using Arrays.binarySearch() method
        System.out.println(Arrays.binarySearch(arr, 8)); // returns address of the element if present else gives a -ve
                                                         // value

        // methods in Collections.*
        // Collections.sort() method
        ArrayList<String> newList = new ArrayList<String>();
        newList.add("Third");
        newList.add("Last");
        newList.add("First");
        newList.add("Start");
        System.out.println(newList);
        Collections.sort(newList);
        System.out.println(newList);
        System.out.println("Max " + Collections.max(newList));
        System.out.println("min " + Collections.min(list));

        // Iterator class
        Iterator it = newList.iterator();
        while (it.hasNext()) {
            System.out.println("Iterated values = " + it.next());
        }

    }
}
