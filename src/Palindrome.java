public class Palindrome {

    public static boolean palindrome(String str) {
        String palindrome = "";
        for (int i = str.length()-1; i >= 0; i--) {
            palindrome += str.charAt(i);
        }
        if(palindrome.equals(str)){
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(palindrome("mom"));
    }
}
