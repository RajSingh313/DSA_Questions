package CollectionsFramework.List.ArrayList;

import java.util.*;

public class ArrayListDemo {
    public static void main(String[] args) {

        // 1. Create ArrayList
        ArrayList<String> list = new ArrayList<>();

        // 2. Add elements
        list.add("Apple");
        list.add("Banana");
        list.add("Mango");
        list.add("Apple"); // duplicate allowed

        System.out.println("Initial List: " + list);

        // 3. Add at specific index
        list.add(1, "Orange");
        System.out.println("After inserting at index 1: " + list);

        // 4. Get element
        System.out.println("Element at index 2: " + list.get(2));

        // 5. Set (update element)
        list.set(2, "Grapes");
        System.out.println("After updating index 2: " + list);

        // 6. Remove by index
        list.remove(3);
        System.out.println("After removing index 3: " + list);

        // 7. Remove by value
        list.remove("Apple");
        System.out.println("After removing 'Apple': " + list);

        // 8. Size of list
        System.out.println("Size: " + list.size());

        // 9. Check if contains element
        System.out.println("Contains Mango? " + list.contains("Mango"));

        // 10. Check if empty
        System.out.println("Is Empty? " + list.isEmpty());

        // 11. Index of element
        System.out.println("Index of Banana: " + list.indexOf("Banana"));

        // 12. Last index of element
        list.add("Banana");
        System.out.println("Last index of Banana: " + list.lastIndexOf("Banana"));

        // 13. Iterate (for-each loop)
        System.out.println("Iterating using for-each:");
        for (String fruit : list) {
            System.out.println(fruit);
        }

        // 14. Iterate using iterator
        System.out.println("Iterating using Iterator:");
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }

        // 15. Clear list
        list.clear();
        System.out.println("After clear: " + list);

        // 16. Check again empty
        System.out.println("Is Empty now? " + list.isEmpty());
    }
}
