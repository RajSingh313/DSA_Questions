package ArraysGeneralQuestion;

import java.util.Arrays;
import java.util.Scanner;

public class CopyOneArrayToAnother {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       int[] original = {3,4,5,6,7,3,2,1};
       int[] copy = new int[original.length];
        //copy elements
        for (int i = 0; i < original.length; i++) {
            copy[i] = original[i];
        }


        System.out.println("Original array: " + Arrays.toString(original));
        //display copied arrayElement
        System.out.println("Copy elements from the original array");
        for (int i = 0; i < original.length; i++) {
            System.out.print( " copied array" + copy[i] + " ");
        }
    }
}
