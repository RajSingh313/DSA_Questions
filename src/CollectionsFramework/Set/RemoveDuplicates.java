package CollectionsFramework.Set;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicates {
    public static void main(String[] args) {
        int[] arr = {12, 3, 4, 5, 4, 3, 6};
        //Use Hashset When you don't want  insertion order
        //Use LinkedHashSet When you want Insertion order
        Set<Integer> set = new LinkedHashSet<>();
        for (int i = 0; i < arr.length; i++) {
            if (!set.contains(arr[i])) {
                set.add(arr[i]);
            }
        }
        System.out.println(set);
    }
}
