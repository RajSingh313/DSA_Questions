package Strings;

public class CountCharactersInString {
    public static void main(String[] args) {
        String name = "Raj Singh";
        int count = 0;
        for(int i=0; i<name.length();i++){
            if(name.charAt(i)!=' '){
                count++;
            }
        }
        System.out.println("Total Charcters in String: " + count);
    }
}
