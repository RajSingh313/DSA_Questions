package SortingAlgorithm;

import java.util.Arrays;

public class BubbleSort {
    public static int[] bubbleSort(int[] arr) {
        for(int i=0;i<arr.length-1;i++){
            boolean flag = false;
            for(int j=0;j<arr.length-i-1;j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    flag = true;
                }
            }
            if(!flag){
                break;
            }

        }
        return arr;

    }
    public static void main(String[] args) {
         int[] arr = {5,6,2,4,7,32,5,3,2};
         System.out.println(Arrays.toString(bubbleSort(arr)));

    }
}
