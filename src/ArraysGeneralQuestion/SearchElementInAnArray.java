package ArraysGeneralQuestion;

public class SearchElementInAnArray {
    public static void main(String[] args) {
        int[] arr = {4,7,5,2,6,7,3,8,9};
        int target = 6;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                System.out.println("Element found at index: " + i);
            }
        }

    }
}
