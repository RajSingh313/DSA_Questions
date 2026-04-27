package KadanesAlgorithm;



public class MaxSubArrayWithElements {

    public static void maxSubArray(int[] arr) {
        int currentSum = 0;
        int maxSum = Integer.MIN_VALUE;

        int start = 0, end = 0, tempStart = 0;

        for (int i = 0; i < arr.length; i++) {
            currentSum += arr[i];

            // Update max sum and indices
            if (currentSum > maxSum) {
                maxSum = currentSum;
                start = tempStart;
                end = i;
            }

            // Reset if negative
            if (currentSum < 0) {
                currentSum = 0;
                tempStart = i + 1;
            }
        }

        // Print results
        System.out.println("Maximum Sum: " + maxSum);
        System.out.print("Subarray: ");

        for (int i = start; i <= end; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        int[] arr = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        maxSubArray(arr);
    }
}
