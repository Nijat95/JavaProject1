package CodingBat;

public class front22 {
    public static String front22(String str) {
        int charCount = 0;
        for(int i = 0; i < str.length(); i++) {
            charCount++;
            if(charCount > 2){
                charCount = 2;
            }
        }
        String twoChar = str.substring(0,charCount);
        System.out.println(twoChar);
        return twoChar + str + twoChar;
    }


    public static void main(String[] args) {
        System.out.println(front22("abc"));
    }
}
