package CodingBat;

public class icyHot {
    public static boolean icyHot(int temp1, int temp2) {
        if(temp1 < 0 && temp2 > 100 || temp1 > 100 && temp2 < 0) {
            return true;
        } else if (temp1 > 0 && temp2 > 0) {
            return false;
        }
        else return false;
    }



    public static void main(String[] args) {
        System.out.println(icyHot(-1,-1));
    }
}
