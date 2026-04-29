package Strings;

public class StringLengthWithoutMehtod {
    public static void main(String[] args) {
        String st = "automation";
        int length = 0;

        for(char c: st.toCharArray()){
            length++;
        }
        System.out.println(length);
    }
}
