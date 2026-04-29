package CollectionsFramework;

import java.util.HashSet;

public class FirstRepeatingChar {
    public static void main(String[] args) {
        String str = "programming";

        Character result = findFirstRepeating(str);

        if (result != null) {
            System.out.println("First repeating character: " + result);
        } else {
            System.out.println("No repeating character found");
        }
    }

    public static Character findFirstRepeating(String str) {
        HashSet<Character> set = new HashSet<>();

        for (char ch : str.toCharArray()) {
            if (set.contains(ch)) {
                return ch;
            }
            set.add(ch);
        }

        return null;
    }
}