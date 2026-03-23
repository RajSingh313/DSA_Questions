package Strings;

public class ReverseString {
    public static void main(String[] args) {
        String s =  "Reverse String";
        char[] charArray = s.toCharArray();
        int left = 0;
        int right = charArray.length - 1;
        while (left < right) {
            char temp = charArray[left];
            charArray[left] = charArray[right];
            charArray[right] = temp;
            left++;
            right--;
        }
        String s1 = new String(charArray);
        System.out.println(s1);
    }
}
