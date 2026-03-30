package GeneralNumberDsaQuestions;

public class ReverseNumber {
    public static int reverseNumber(int number) {
        int reversedNumber = 0;
        while (number != 0) {
            int remainder = number % 10;
            reversedNumber = reversedNumber * 10 + remainder;
            number = number / 10;
        }
        return reversedNumber;
    }
    public static void main(String[] args) {
        System.out.println(reverseNumber(98734));
    }
}
