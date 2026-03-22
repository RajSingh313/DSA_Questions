package ArraysGeneralQuestion;

import java.util.HashMap;

public class TwoSumInUnsortedArray {
    public static void main(String[] args) {
        int[] arr = {2, 7, 11, 4};
        int target = 18;
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i =0;i< arr.length;i++){
            int complement = target -arr[i];
            if(map.containsKey(complement)){
                System.out.println(complement + " and  " + arr[i]);
                return;
            }
            map.put(arr[i],i);
        }
        System.out.println("Not found");
    }
}
