package TwoPointer;

public class PalindromeStringCheck {
    public static boolean isPalindrome(String s){
        s = s.toLowerCase().replaceAll("[^a-z0-9]", "");
        int left = 0;
        int right = s.length()-1;

        // Continue looping while the two pointers
        // have not crossed
        while (left <right){

            // If the characters at the current positions are not equal
            if(s.charAt(left) != s.charAt(right)){
                return false;
            }

            // Move the left pointer to the right and
            // the right pointer to the left
            left++;
            right--;


        }
        return true;
    }

    public static void main(String[] args) {
       //String s = "racecar" ;
        String s = "A man, a plan, a canal: Panama";
        System.out.println(isPalindrome(s));
    }
}
