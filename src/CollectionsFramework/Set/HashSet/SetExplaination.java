package CollectionsFramework.Set.HashSet;

import java.util.*;

public class SetExplaination {
    public static void main(String[] args) {

        // ---------------- HASHSET ----------------
        System.out.println("HASHSET");

        Set<String> hashSet = new HashSet<>();

        hashSet.add("Apple");
        hashSet.add("Banana");
        hashSet.add("Mango");
        hashSet.add("Apple"); // duplicate ignored

        System.out.println("HashSet: " + hashSet);

        System.out.println("Contains Mango? " + hashSet.contains("Mango"));

        hashSet.remove("Banana");
        System.out.println("After remove: " + hashSet);

        System.out.println("Size: " + hashSet.size());

        // Iterator
        System.out.println("Using Iterator:");
        Iterator<String> it = hashSet.iterator();
        while(it.hasNext()) {
            System.out.println(it.next());
        }

        // ---------------- LINKEDHASHSET ----------------
        System.out.println("\nLINKEDHASHSET");

        Set<String> linkedSet = new LinkedHashSet<>();

        linkedSet.add("Java");
        linkedSet.add("Python");
        linkedSet.add("C++");

        System.out.println("LinkedHashSet: " + linkedSet);

        // ---------------- TREESET ----------------
        System.out.println("\nTREESET");

        Set<Integer> treeSet = new TreeSet<>();

        treeSet.add(40);
        treeSet.add(10);
        treeSet.add(30);
        treeSet.add(20);

        System.out.println("TreeSet (Sorted): " + treeSet);

        // ---------------- addAll ----------------
        Set<String> set1 = new HashSet<>();
        set1.add("A");
        set1.add("B");

        Set<String> set2 = new HashSet<>();
        set2.add("B");
        set2.add("C");

        set1.addAll(set2);
        System.out.println("\nAfter addAll: " + set1);

        // ---------------- retainAll ----------------
        Set<String> set3 = new HashSet<>(Arrays.asList("A","B","C"));
        Set<String> set4 = new HashSet<>(Arrays.asList("B","C","D"));

        set3.retainAll(set4);
        System.out.println("Common Elements: " + set3);

        // ---------------- removeAll ----------------
        Set<String> set5 = new HashSet<>(Arrays.asList("A","B","C"));
        Set<String> set6 = new HashSet<>(Arrays.asList("B"));

        set5.removeAll(set6);
        System.out.println("After removeAll: " + set5);

        // ---------------- clear ----------------
        hashSet.clear();
        System.out.println("\nAfter clear HashSet: " + hashSet);

        System.out.println("Is Empty? " + hashSet.isEmpty());
    }
}
