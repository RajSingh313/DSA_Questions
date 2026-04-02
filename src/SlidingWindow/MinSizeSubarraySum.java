package SlidingWindow;

public class MinSizeSubarraySum {


    public static int minSubArrayLen(int target, int[] nums) {

        int n = nums.length;

        int left = 0;           // Left boundary of the window
        int currentSum = 0;     // Running sum of the current window
        int minLength = Integer.MAX_VALUE; // Store the minimum length found

        // Expand the window by moving the right pointer
        for (int right = 0; right < n; right++) {

            // Add the current element to the window sum
            currentSum += nums[right];

            // Shrink the window from the left as long as sum >= target
            while (currentSum >= target) {

                // Calculate current window length
                int windowLength = right - left + 1;

                // Update minimum length if this window is smaller
                minLength = Math.min(minLength, windowLength);

                // Remove the leftmost element and shrink the window
                currentSum -= nums[left];
                left++;
            }
        }

        // If minLength was never updated, no valid subarray was found
        return (minLength == Integer.MAX_VALUE) ? 0 : minLength;
    }

    public static void main(String[] args) {

        // Test Case 1: Expected output = 2 (subarray [4, 3])
        int[] nums1 = {2, 3, 1, 2, 4, 3};
        int target1 = 7;
        System.out.println("Test 1 -> Input: [2,3,1,2,4,3], Target: 7");
        System.out.println("         Min Length: " + minSubArrayLen(target1, nums1));
        // Window trace: [2,3,1,2] sum=8 ✓, shrink -> [3,1,2,4] -> [4,3] sum=7 ✓ length=2

        System.out.println();

        // Test Case 2: Expected output = 1 (subarray [8])
        int[] nums2 = {1, 4, 4};
        int target2 = 4;
        System.out.println("Test 2 -> Input: [1,4,4], Target: 4");
        System.out.println("         Min Length: " + minSubArrayLen(target2, nums2));

        System.out.println();

        // Test Case 3: Expected output = 0 (no valid subarray exists)
        int[] nums3 = {1, 1, 1, 1};
        int target3 = 10;
        System.out.println("Test 3 -> Input: [1,1,1,1], Target: 10");
        System.out.println("         Min Length: " + minSubArrayLen(target3, nums3));

        System.out.println();

        // Test Case 4: Entire array is the answer
        int[] nums4 = {1, 2, 3, 4, 5};
        int target4 = 15;
        System.out.println("Test 4 -> Input: [1,2,3,4,5], Target: 15");
        System.out.println("         Min Length: " + minSubArrayLen(target4, nums4));
    }
}