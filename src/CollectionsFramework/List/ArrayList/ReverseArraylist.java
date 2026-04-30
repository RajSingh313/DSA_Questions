package CollectionsFramework.List.ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class ReverseArraylist {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
        reverse(list);
        System.out.println(list);
    }

    public static void reverse(ArrayList<Integer> list) {
        int left = 0;
        int right = list.size() - 1;
        while (left < right) {
            int temp = list.get(left);
            list.set(left, list.get(right));
            list.set(right, temp);
            left++;
            right--;
        }
    }
}
