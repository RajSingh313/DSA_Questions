package GeneralNumberDsaQuestions;

public class CheckPalindrome {
    public static boolean isPalindrome(int x) {
        int original = x;
        int reversed = 0;
        while (original != 0) {
            reversed = reversed * 10 + original % 10;
            original = original / 10;
        }
        if (reversed == original) {
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        System.out.println(isPalindrome(10));
    }
}
