package ArraysGeneralQuestion;

import java.util.Arrays;

public class ProductOfArrayExceptItself {
    public static int[] productExceptItself(int[] arr) {
        int n = arr.length;
        int[] result = new int[n];

        // Step 1: Left product
        result[0] = 1;
        for (int i = 1; i < n; i++) {
            result[i] = result[i - 1] * arr[i - 1];
        }

        // Step 2: Right product
        int rightProduct = 1;
        for (int i = n - 1; i >= 0; i--) {
            result[i] *= rightProduct;
            rightProduct *= arr[i];
        }

        return result;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(productExceptItself(arr)));
    }
}