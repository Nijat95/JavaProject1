package CodingBat;

public class starOut {
    public String starOut(String str) {
        int len = str.length();
        String finalString = "";

        for (int i = 0; i < len; i++) {
            if (i == 0 && str.charAt(i) != '*')
                finalString += str.charAt(i);

            if (i > 0 && str.charAt(i) != '*' && str.charAt(i-1) != '*')
                finalString += str.charAt(i);

            if (i > 0 && str.charAt(i) == '*' && str.charAt(i-1) != '*')
                finalString = finalString.substring(0,finalString.length()-1);
        }
        return finalString;
    }

    public static void main(String[] args) {
        starOut str = new starOut();
        System.out.println(str.starOut("ab*cd"));
    }

}
