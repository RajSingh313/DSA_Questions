package CollectionsFramework.Map.HashMap;

import java.util.*;

public class DetectDuplicatesMap {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 2, 5, 1};

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int num : arr) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        System.out.println("Duplicates:");
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() > 1) {
                System.out.println(entry.getKey());
            }
        }
    }
}
