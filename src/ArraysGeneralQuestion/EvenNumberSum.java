package ArraysGeneralQuestion;

public class EvenNumberSum {
    public static void main(String[] args) {
        int[] arr = {3,4,5,8,10,4,16};
        int sum = 0;
        for(int i =0; i< arr.length; i++){
            if(arr[i]%2==0)
            sum = sum+arr[i];
        }
        System.out.println(sum);
    }
}
