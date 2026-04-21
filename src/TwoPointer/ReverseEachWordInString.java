package TwoPointer;

public class ReverseEachWordInString {
    public static void main(String[] args) {
        String input = "Hello World Java";

        String result = reverseEachWord(input);
        System.out.println(result);
    }

    public static String reverseEachWord(String str) {
        String[] words = str.split(" ");
        StringBuilder reversedString = new StringBuilder();

        for (String word : words) {
            StringBuilder reversedWord = new StringBuilder(word);
            reversedString.append(reversedWord.reverse()).append(" ");
        }

        return reversedString.toString().trim();
    }
}
