package CollectionsFramework.Set.LinkedHashSet;

import java.util.*;

public class RemoveDuplicates {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(5, 3, 5, 2, 3, 8, 2, 9);

        // Using LinkedHashSet
        Set<Integer> set = new LinkedHashSet<>(list);

        // Convert back to list (if needed)
        List<Integer> result = new ArrayList<>(set);

        System.out.println("Original List: " + list);
        System.out.println("After Removing Duplicates (Order Preserved): " + result);
    }
}