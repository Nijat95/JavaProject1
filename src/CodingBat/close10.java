package CodingBat;

public class close10 {
    public static int close10(int a, int b) {
        int x = Math.abs(10-a);
        int y = Math.abs(10-b);
        if(x < y){
            return a;
        } else if (x > y) {
            return b;
        }
         return 0;

    }


    public static void main(String[] args) {
        System.out.println(close10(13,7));
    }
}
