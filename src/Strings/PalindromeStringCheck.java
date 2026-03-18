package Strings;

public class PalindromeStringCheck {
    public static void main(String[] args) {

        //This is Through loops
        String str= "level";
        String rev="";
        for (int i= str.length()-1;i>=0;i--){
            rev =rev+str.charAt(i);
        }

        if (str.equalsIgnoreCase(rev)){
            System.out.println(str + " is a Palindrome");
        }
        else{
            System.out.println(str + " is not Palindrome");
        }


        //This is through StringBuilder
        String s2  = "Racecar";
        String rev2 = new StringBuilder(s2.toLowerCase()).reverse().toString();
        boolean isPalinDrome = s2.toLowerCase().equals(rev2);
        System.out.println(isPalinDrome);

    }
}
