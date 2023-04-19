package CodingBat;

public class posNeg {

    public boolean posNeg(int a, int b, boolean negative) {
        if( a <0 &&  b > 0){
            return negative = true;
        }
        else if(b < 0 && a > 0){
            return negative = true;
        }
        else if(b < 0 && a < 0 && negative){
            return negative = false;
        }
        return negative;
    }


    public static void main(String[] args) {

    }
}
