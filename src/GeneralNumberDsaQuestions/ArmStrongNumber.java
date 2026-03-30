package GeneralNumberDsaQuestions;

public class ArmStrongNumber {
    public static boolean isArmStrongNumber(int number) {
        int original = number;
        int sum = 0;
        int digits = String.valueOf(number).length();
        while (number != 0) {
            int digit = number % 10;
            sum+=Math.pow(digit, digits);
            number /= 10;

        }
        return sum == original;
    }
    public static void main(String[] args) {
        System.out.println(isArmStrongNumber(153));
    }
}
