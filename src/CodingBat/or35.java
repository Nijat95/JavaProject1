package CodingBat;

public class or35 {
    public static boolean or35(int n) {
        if (n % 3 == 0) {
            return true;
        } else if (n % 5 == 0) {
            return true;
        }
       return false;
    }

        public static void main (String[]args){
            System.out.println(or35(15));
        }
    }


