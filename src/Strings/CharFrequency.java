package Strings;

public class CharFrequency {

    public static void main(String[] args) {
        String str = "programming";

        str = str.toLowerCase();

        int[] freq = new int[256]; // ASCII size

        // Count frequency
        for (int i = 0; i < str.length(); i++) {
            freq[str.charAt(i)]++;
        }

        // Print results
        System.out.println("Character frequencies:");
        for (int i = 0; i < 256; i++) {
            if (freq[i] != 0) {
                System.out.println((char)i + " : " + freq[i]);
            }
        }
    }
}