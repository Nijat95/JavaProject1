package CodingBat;

public class hasTeen {
    public static boolean hasTeen(int a, int b, int c) {
        if(a > 12 && a < 20 || b > 12 && b < 20 || c > 12 && c < 20){
            return true;
        }else
            return false;
    }


    public static void main(String[] args) {
        System.out.println(hasTeen(13,20,10));
    }
}
