package GeneralNumberDsaQuestions;

public class SwapTwoNumbers {
    public static void main(String[] args) {
        int a = 8;
        int b = 5;

        System.out.println( "a: " + a);
        System.out.println("b: " + b);

        System.out.println("-------------------");
        a = a^b; //8^5
        b= b^a; //5^8^5= 8
        a= a^b; //5^8^8 = 5
        System.out.println( "a: " + a);
        System.out.println("b: " + b);

    }
}
