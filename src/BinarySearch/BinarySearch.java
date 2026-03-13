package BinarySearch;

public class BinarySearch {
    static int binarySearch(int arr[], int startIndex, int endIndex, int target) {

        while (startIndex <= endIndex) {
            int mid = (startIndex + endIndex) / 2;
            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] > target) {
                endIndex = mid - 1;

            } else {
                startIndex = mid + 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50, 60};
        int lenth = arr.length;
        int target = 40;
        int res = binarySearch(arr, 0, lenth - 1, target);
        System.out.println("Element to be searched is : " + target);
        if (res == -1) {
            System.out.println("Element Not found");
        } else {
            System.out.println("Element is present in array at index:  " + res);
        }

    }
}
