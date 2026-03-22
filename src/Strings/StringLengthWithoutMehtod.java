package Strings;

public class StringLengthWithoutMehtod {
    public static void main(String[] args) {
        String st = "automation";
        int length= 0;
        try {
            while (true){
                st.charAt(length);
                length++;
            }

        }
        catch (StringIndexOutOfBoundsException e){

        }
        System.out.println("Lenght of String: " + length);

    }
}
