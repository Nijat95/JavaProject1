package CodingBat;

public class intMax {
    public static int intMax(int a, int b, int c) {
        if(a > b && a > c){
            return a;
        } else if (b > a && b > c) {
            return b;
        }else if (c > a && c > b) {
            return c;
        }
        return 0;
    }


        public static void main(String[] args) {
        System.out.println(intMax(13,2,3));
    }
}
