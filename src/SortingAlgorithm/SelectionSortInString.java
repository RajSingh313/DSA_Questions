package SortingAlgorithm;

import java.util.Arrays;

public class SelectionSortInString {
    public static String[] sortString(String[] input) {
        for (int i = 0; i < input.length; i++) {
            int min = i;
            for (int j = i + 1; j < input.length; j++) {
                if (input[j].compareTo(input[min]) < 0) {
                    min = j;

                }
            }
            String temp = input[i];
            input[i] = input[min];
            input[min] = temp;
        }
        return input;
    }
    public static void main(String[] args) {
        String[] arr= {"Raj", "Varun", "Jeetu", "Nuro","Viju", "Neeshu"};
        System.out.println(Arrays.toString(sortString(arr)));
    }

}
