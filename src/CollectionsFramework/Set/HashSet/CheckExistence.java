package CollectionsFramework.Set.HashSet;

import java.util.*;

public class CheckExistence {
    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>();

        set.add(10);
        set.add(20);
        set.add(30);

        int target = 20;

        //contains() → O(1) average time complexity due to hashing.
        if (set.contains(target)) {
            System.out.println(target + " exists in the set");
        } else {
            System.out.println(target + " does not exist");
        }
    }
}
