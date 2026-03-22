package ArraysGeneralQuestion;

public class MaxDifferenceBetweenTwoElements {
    public static void main(String[] args) {
        int[] arr = {2, 3, 25, 6, 4, 8, 1};
        int minSoFar = arr[0];//start with first element
        int maxDiff =0; // no differnce yet

        for(int i=1 ; i< arr.length ; i++){
            //step 1 = can i get bigger differnce
            int diff = arr[i] - minSoFar;
            if(diff > maxDiff) {
                maxDiff = diff;
            }

            //step-2 is current element smaller than min so far
            if(arr[i] <minSoFar){
                minSoFar=arr[i];
            }

        }

        System.out.println("Maximum Differnce: " + maxDiff);

    }
}
