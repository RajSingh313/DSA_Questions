package ArraysGeneralQuestion;

public class FindMissingNumber {
    static int missingNumber(int[] arr, int number) {
        int N = number + 1;
        int totalSum = N * (N + 1) / 2;
        int arrSum = 0;
        for (int i = 0; i < number; i++) {
            arrSum += arr[i];
        }
        return totalSum - arrSum;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 5};
        int missingNumber = missingNumber(arr, arr.length);
        System.out.println(missingNumber);
    }
}
