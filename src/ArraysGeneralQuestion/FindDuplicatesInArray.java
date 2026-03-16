package ArraysGeneralQuestion;

public class FindDuplicatesInArray {
    public static void main(String[] args) {
        int[] arr = { 3,4,6,4,8,3,9,6};
        for(int i =0; i< arr.length; i++){
            for(int j= i+1; j< arr.length;j++){
                if(arr[i]==arr[j])
                System.out.print(arr[i] + " ");
            }
        }
    }
}
