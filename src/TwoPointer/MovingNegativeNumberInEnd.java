package TwoPointer;

import java.util.Arrays;

public class MovingNegativeNumberInEnd {
    static void moveNegatives(int[] arr) {
        int j = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= 0) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                j++;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 0, -5, -4, 6, -7};
        System.out.println("Orginal: " + Arrays.toString(arr));
        moveNegatives(arr);
        System.out.println("After Moving Negative Numbers: " + Arrays.toString(arr));

    }
}
