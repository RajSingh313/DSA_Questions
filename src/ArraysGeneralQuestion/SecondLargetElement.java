package ArraysGeneralQuestion;

public class SecondLargetElement {
    public static void main(String[] args) {
        int[] arr = {3, 4, 5, 2, 3, 6, 9};
        int max = 0;
        int secondMax = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                secondMax = max;
                max = arr[i];
            }

            if (arr[i] < max && arr[i] > secondMax) {
                secondMax = arr[i];
            }
        }

        System.out.println("Largest: " + max);
        System.out.println("Second Largest: " + secondMax);

    }
}
