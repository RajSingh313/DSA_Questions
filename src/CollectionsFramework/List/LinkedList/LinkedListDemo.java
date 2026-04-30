package CollectionsFramework.List.LinkedList;

import java.util.*;

public class LinkedListDemo {
    public static void main(String[] args) {

        // 1. Create LinkedList
        LinkedList<String> list = new LinkedList<>();

        // 2. Add elements
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("A"); // duplicate allowed

        System.out.println("Initial List: " + list);

        // 3. Add at specific index
        list.add(1, "X");
        System.out.println("After inserting at index 1: " + list);

        // 4. Add First & Last
        list.addFirst("Start");
        list.addLast("End");
        System.out.println("After addFirst & addLast: " + list);

        // 5. Get elements
        System.out.println("Element at index 2: " + list.get(2));
        System.out.println("First element: " + list.getFirst());
        System.out.println("Last element: " + list.getLast());

        // 6. Update element
        list.set(2, "Updated");
        System.out.println("After update: " + list);

        // 7. Remove elements
        list.remove(3); // by index
        list.remove("A"); // by value
        System.out.println("After removals: " + list);

        // 8. Remove First & Last
        list.removeFirst();
        list.removeLast();
        System.out.println("After removeFirst & removeLast: " + list);

        // 9. Size
        System.out.println("Size: " + list.size());

        // 10. Contains
        System.out.println("Contains B? " + list.contains("B"));

        // 11. Index operations
        list.add("B");
        System.out.println("Index of B: " + list.indexOf("B"));
        System.out.println("Last index of B: " + list.lastIndexOf("B"));

        // 12. Iteration (for-each)
        System.out.println("For-each loop:");
        for (String item : list) {
            System.out.println(item);
        }

        // 13. Iterator
        System.out.println("Using Iterator:");
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }

        // 14. Queue behavior
        list.offer("QueueItem");
        System.out.println("After offer: " + list);

        System.out.println("Poll (remove head): " + list.poll());
        System.out.println("After poll: " + list);

        // 15. Clear
        list.clear();
        System.out.println("After clear: " + list);
        System.out.println("Is Empty? " + list.isEmpty());
    }
}
