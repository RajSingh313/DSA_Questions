package SortingAlgorithm;

import java.util.Arrays;

public class InsertionSortInString {
public static String[] insertionSort(String[] a) {
    for (int i = 1; i < a.length; i++) {
        String temp = a[i];
        int j = i - 1;
        while (j >= 0 && temp.compareTo(a[j]) < 0) {
            a[j + 1] = a[j];
            j = j - 1;
        }
        a[j + 1] = temp;
    }
    return a;
}
public static void main(String[] args) {
    String[] a = {"Raj", "Ahad", "Safeer", "Hammad", "Fazal", "Hasnain"};
    System.out.println(Arrays.toString(insertionSort(a)));
}

}
