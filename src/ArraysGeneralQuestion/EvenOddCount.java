package ArraysGeneralQuestion;

public class EvenOddCount {
    public static void main(String[] args) {
        int[] arr = {1,4,6,3,2,5,7,8,9};
        int evenCount = 0;
        int oddCount = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                evenCount++;
            }
            if (arr[i] % 2 == 1) {
                oddCount++;
            }

        }
        System.out.println( "Total Even Numbers "  + evenCount);
        System.out.println("Total Odd Numbers "+ oddCount);
    }
}
