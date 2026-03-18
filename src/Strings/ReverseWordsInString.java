package Strings;

public class ReverseWordsInString {
    public static String reverseWordInString(String s){
        s= s.trim();
        String[] words = s.split("\\s+");
        String result = "";
        for(int i = words.length-1;i>=0;i--){
            result  = result+ words[i];
            if(i>0){
                result = result+ " ";

            }
        }

        return  result;
    }

    public static void main(String[] args) {
       String s= "sky is the blue";
        System.out.println(reverseWordInString(s));
    }

}
