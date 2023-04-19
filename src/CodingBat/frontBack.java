package CodingBat;

public class frontBack {
    public String frontBack(String str) {
        if (str.length() <= 1) return str;

        String mid = str.substring(1, str.length()-1);
        System.out.println(mid);

        // last + mid + first
        return str.charAt(str.length()-1) + mid + str.charAt(0);
    }

    public static void main(String[] args) {
        frontBack frontBack = new frontBack();
        System.out.println(frontBack.frontBack("hello"));

    }
}
