package Strings;

public class CounrVowelsAnsConsonents {
    public static void main(String[] args) {
        String str = "Raj Singh Sodha";
        str = str.toLowerCase();
        int vowels =0;
        int consonants = 0 ;
        for(int i = 0; i<str.length();i++){
            char ch = str.charAt(i);
            if(ch>='a' &&  ch<='z'){
                if(ch=='a' || ch=='e'||ch=='i'||ch=='o' ||ch=='u'){
                    vowels++;
                }
                else {
                    consonants++;
                }
            }
        }

        System.out.println("Vowels: " + vowels + " " + "Consonents: " + consonants);
    }
}
