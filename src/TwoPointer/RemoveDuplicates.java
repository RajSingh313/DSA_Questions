package TwoPointer;

import java.util.Arrays;

public class RemoveDuplicates {
    public static int removeDuplicates(int[] nums) {
        int i = 0;
        for (int j = 1; j < nums.length; j++) {
            if (nums[j] != nums[i]) {
                i++;
                nums[i] = nums[j];
            }
        }
        return i+1;
    }
    public static void main(String[] args) {
        int[] nums = {1,1,2,2,3,3,4};
        int newSize = removeDuplicates(nums);
        System.out.println("unique array");
        for (int i = 0; i < newSize; i++) {
            System.out.print(nums[i] + " ");
        }
    }
}
