package CodingBat;

public class max1020 {
    public static int max1020(int a, int b) {
        if (a >= 10 && a <= 20 || b >= 10 && b <= 20 ) {
            int x =  Math.abs(20 - a);
            int y =  Math.abs(20 - b);


            if(x < y){
                return a;
            } else if (y < x) {
                return b;
            }
        }
        return 0;
    }


    public static void main(String[] args) {
        System.out.println(max1020(10,21));
    }
}
