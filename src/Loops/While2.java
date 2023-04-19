package Loops;

public class While2 {
    public static void main(String[] args) {

        String str1 = "Rock";

        String palindrome1 = "";//

        int i = str1.length() - 1;
        while(i >= 0) {
            palindrome1 += str1.charAt(i);
            i--;
        }
        if(str1.toLowerCase().equals(palindrome1.toLowerCase())) {
            System.out.println("This is a Palindrome " + palindrome1 + " : " + str1);
        }else{
            System.out.println("This is not Palindrome " + palindrome1 + " : " + str1);
        }
    }
}
