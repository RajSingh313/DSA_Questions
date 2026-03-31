package SlidingWindow;

public class MaxSumSubArray {
    public static int maxSumSubArray(int[] nums, int k) {

        int windowSum = 0; // Stores the sum of the current group of 'k' elements
        int maxSum = 0;    // Keeps track of the highest sum we've seen so far

        // STEP 1: Create the very first window
        // We sum up the first 'k' elements (from index 0 to k-1)
        for(int i = 0; i < k; i++) {
            windowSum += nums[i];
        }

        // At the start, the first window sum is technically our maximum sum
        maxSum = windowSum;

        // STEP 2: Slide the window across the rest of the array
        // We start 'i' at index 'k' because that's the next element entering the window
        for(int i = k; i < nums.length; i++) {

            // Add the new element entering from the RIGHT
            windowSum += nums[i];

            // Subtract the element that is now outside the window on the LEFT
            // The element to remove is always 'k' steps behind our current index 'i'
            windowSum -= nums[i - k];

            // STEP 3: Compare and Update
            // If our new window sum is larger than what we had before, update maxSum
            if(windowSum > maxSum) {
                maxSum = windowSum;
            }
        }

        return maxSum;
    }

    public static void main(String[] args) {
        // Example array
        int[] nums = {3, 6, 2, 8, 4, 7};
        int k = 4;

        // Call the function and print the result
        int result = maxSumSubArray(nums, k);
        System.out.println("The maximum sum of a subarray of size " + k + " is: " + result);
    }
}