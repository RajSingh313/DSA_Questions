package SortingAlgorithm;

import java.util.Arrays;

public class SelectionSort {
    public static int[] selectionSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++)//this loop is for number of passes
        {
            int minIndex = i; // let suppose minium index is at i
            for (int j = i + 1; j < arr.length; j++) // this will traverse array
            {
                if (arr[j] < arr[minIndex])// this if statement finding minium value in an array
                {
                    minIndex = j; // and assigning that values index position to minIndex

                }

            }
            int temp = arr[minIndex]; // here we swaping founds value
            arr[minIndex] = arr[i];
            arr[i] = temp;

        }

        return arr;

    }
    public static void main(String[] args) {
        int[] arr = {3,4,5,2,4,2,4,5,6,4};
        System.out.println(Arrays.toString(selectionSort(arr)));
    }
}
