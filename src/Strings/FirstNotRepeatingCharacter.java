package Strings;

import java.util.HashMap;
import java.util.Map;

public class FirstNotRepeatingCharacter {

   static char firstNonRepeatingCharacter(String str) {
        int[] count = new int[26];
       // Pass 1: count frequency of each character
        for(char c :str.toCharArray()){
            count[c-'a']++;
        }
        // Pass 2: find first char with frequency 1
        for (char c: str.toCharArray()){
            if(count[c-'a']==1){
                return c;
            }
        }
        return '_';
    }

    static char firstNonRepeatingCharacter2(String str) {

       Map<Character, Integer> map = new HashMap<>();
       for(int i =0;i<str.length();i++){
           char c = str.charAt(i);
           map.put(c,map.getOrDefault(c,0)+1);

       }
        // Pass 2: find first char with frequency 1
        for (int i =0; i<str.length();i++){
            char c = str.charAt(i);
            if(map.get(c)==1){
                return c;
            }
        }

        return '_';
    }
    public static void main(String[] args) {
        String str = "aabc";
        System.out.println(firstNonRepeatingCharacter(str));
        System.out.println(firstNonRepeatingCharacter2(str));


    }
}
