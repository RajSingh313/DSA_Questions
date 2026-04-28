package Strings;

public class ReverseEachWordInString2{
    public static String reverseEachWord(String s){
        String result = "";
        String word = "";

        for(int i=0; i<s.length();i++){
            char c = s.charAt(i);
            if (c!= ' '){
                word = c+word;
            }
            else {
                result += word+" ";
                word ="";
            }
        }
        result+=word;
        return result;
    }

    public static void main(String[] args) {
        String s = "java is fun";
        System.out.println(reverseEachWord(s));
    }
}
