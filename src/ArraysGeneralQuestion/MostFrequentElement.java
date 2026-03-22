package ArraysGeneralQuestion;


import java.util.HashMap;

public class MostFrequentElement {
    public static void main(String[] args) {
        int[] arr = {1, 3, 2, 1, 4, 1, 3};

        HashMap<Integer, Integer> frequentMap = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            if (!frequentMap.containsKey(arr[i])) {
                frequentMap.put(arr[i], 1);
            } else {
                frequentMap.put(arr[i], frequentMap.get(arr[i]) + 1);
            }
        }

        int maxCount = 0;
        int mostFrequent = -1;
        for (int key : frequentMap.keySet()) {
            if (frequentMap.get(key) > maxCount) {
                maxCount = frequentMap.get(key);
                mostFrequent = key;
            }
        }
        System.out.println("Most Frequent: " + mostFrequent); // 1
        System.out.println("Appears: " + maxCount + " times"); // 3
    }
}

