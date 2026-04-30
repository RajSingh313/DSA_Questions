package CollectionsFramework.List.ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class RemoveDuplicates {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1,2,3,4,3,4,5,1,7,8));
        ArrayList<Integer> result = removeDuplicates(list);
        System.out.println("without duplicates" + result);
    }
    public static ArrayList<Integer> removeDuplicates(ArrayList<Integer> list) {
        HashSet<Integer> set = new HashSet<Integer>(list);
        return new ArrayList<>(set);
    }
}
