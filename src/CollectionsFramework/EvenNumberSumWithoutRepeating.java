package CollectionsFramework;

import java.util.HashSet;

public class EvenNumberSumWithoutRepeating {

    public static void main(String[] args) {
        int[] arr = {3, 4, 4, 5, 6, 7, 8, 2, 2, 2, 2, 4, 4};
        int evenSum = 0;
        HashSet<Integer> set = new HashSet<>();
        for (int num : arr) {
            if (num % 2 == 0 && !set.contains(num)) {
                evenSum += num;
                set.add(num);

            }
        }
        System.out.println("Total Even Numbers Sum: " + evenSum);

    }
}
