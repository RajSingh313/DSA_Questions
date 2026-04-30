package CollectionsFramework.List.ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class FindSecondLargest {
    public static  int findSecondLargest(ArrayList<Integer> list) {
        int max = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;
        for(int num : list){
            if(num > max) {
                second = max;
                max = num;
            } else if(num > second && num != max) {
                second = num;
            }}

        return second;

    }
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(10, 20, 5, 30, 25));

        int secondLargest = findSecondLargest(list);
        System.out.println("Second Largest: " + secondLargest);
    }
}
