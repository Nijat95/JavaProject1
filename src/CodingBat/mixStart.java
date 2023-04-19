package CodingBat;

public class mixStart {
    public static boolean mixStart(String str) {
        String ix = "ix";
        if(str.startsWith(ix,1)){
            return true;
        }
        return false;
    }


    public static void main(String[] args) {
        System.out.println(mixStart("piz"));
    }
}
