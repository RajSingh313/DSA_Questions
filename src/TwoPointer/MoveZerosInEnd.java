package TwoPointer;

import java.util.Arrays;

public class MoveZerosInEnd {
    static void moveZeros(int[] arr) {
        int j = 0; // index number to track next non-zero number
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                j++;

            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {3, 4, 5, 0, 6, 7, 0, 8, 0, 3, 2};
        System.out.println("Original Array: " + Arrays.toString(arr));
        moveZeros(arr);
        System.out.println("After Moving zero in end" + Arrays.toString(arr));
    }
}
