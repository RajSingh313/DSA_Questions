package CollectionsFramework.Map;

import java.util.*;

public class MapExplaination {

    public static void main(String[] args) {

        // 1. HashMap Example
        System.out.println("---- HashMap ----");
        Map<String, Integer> hashMap = new HashMap<>();
        hashMap.put("Raj", 90);
        hashMap.put("Aman", 85);
        hashMap.put("Neha", 95);

        System.out.println("HashMap: " + hashMap);

        // 2. LinkedHashMap Example
        System.out.println("\n---- LinkedHashMap ----");
        Map<String, Integer> linkedMap = new LinkedHashMap<>();
        linkedMap.put("Raj", 90);
        linkedMap.put("Aman", 85);
        linkedMap.put("Neha", 95);

        System.out.println("LinkedHashMap: " + linkedMap);

        // 3. TreeMap Example
        System.out.println("\n---- TreeMap ----");
        Map<String, Integer> treeMap = new TreeMap<>();
        treeMap.put("Raj", 90);
        treeMap.put("Aman", 85);
        treeMap.put("Neha", 95);

        System.out.println("TreeMap (Sorted): " + treeMap);

        // 4. Common Methods
        System.out.println("\n---- Common Methods ----");
        System.out.println("Get Raj Marks: " + hashMap.get("Raj"));
        System.out.println("Contains Key 'Aman': " + hashMap.containsKey("Aman"));

        hashMap.remove("Aman");
        System.out.println("After Removing Aman: " + hashMap);

        // Iterating Map
        System.out.println("\n---- Iteration ----");
        for (Map.Entry<String, Integer> entry : hashMap.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }

        // 5. DSA Problem: Frequency of Elements
        System.out.println("\n---- Frequency Count ----");
        int[] arr = {1, 2, 2, 3, 1, 4, 2};

        Map<Integer, Integer> freqMap = new HashMap<>();

        for (int num : arr) {
            freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);
        }

        System.out.println("Frequency Map: " + freqMap);
    }
}
