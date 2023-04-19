package Methods;

public class Method2 {

    public static void main(String[] args) {

        sum(45,80);
        //sum(45,34,23);
        float f1 = division(100,45);
        float f2 = division(150,4);
        System.out.println(f1 + " " + f2);
        System.out.println(division(100,45));
        myStr("Nijat");

    }

    public static void sum(int n1, int n2) {
        int n3 = n1 + n2;
        System.out.println(n3);
    }

    public static void sum(short n1, short n2){
        System.out.println(n1 + n2);
    }

    public static void sum(int n1, int n2, int n3) {
        System.out.println(n1 + n2 + n3);
    }

    // 2 methods that returns the product of numbers

    public static int product(int n1, int n2){
        return n1 * n2;
    }

    public static float product(float n1, float n2){
        return n1 * n2;
    }

    public static float division(float n1, float n2){
        return n1 / n2;
    }

    public static double division(double n1, double n2, double n3){
       return n1 / n2 / n3;
   }

    public static void myStr(String str){
        System.out.println(str.length() + " characters");
        System.out.println(str.charAt(0) + " is the first character");
        System.out.println(str.charAt(str.length() - 1) + " is the last character");
    }

}
