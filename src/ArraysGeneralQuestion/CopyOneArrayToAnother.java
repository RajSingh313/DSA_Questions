package ArraysGeneralQuestion;

import java.util.Scanner;

public class CopyOneArrayToAnother {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int n = sc.nextInt();
        int[] original = new int[n];
        int[] copy = new int[n];

        System.out.println("Enter the elements of the array");
        for (int i = 0; i < n; i++) {
            original[i] = sc.nextInt();
        }
        //copy elements
        for (int i = 0; i < n; i++) {
            copy[i] = original[i];
        }

        //display copied arrayElement
        System.out.println("Copy elements from the original array");
        for (int i = 0; i < n; i++) {
            System.out.print(copy[i] + " ");
        }
    }
}
