package CodingBat;

public class startHI {
    public static boolean startHi(String str) {
        if(str.toLowerCase().startsWith("hi")){
            return true;
        }
        return false;
    }


    public static void main(String[] args) {
        System.out.println(startHi("hi there"));
    }
}
