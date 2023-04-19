package CodingBat;

public class backAround {
    public static String backAround(String str) {
        String backAround = "";
        String lastLetter = "";
        for (int i = 0; i < str.length(); i++) {
            lastLetter = String.valueOf(str.charAt(i));
        }
        backAround = lastLetter + str + lastLetter;
        return backAround;
    }


    public static void main(String[] args) {
        System.out.println(backAround("Nijat"));
    }
}
