import java.util.ArrayList;

public class Fibonnacci {
    public static void main(String[] args) {
        int a = 0;
        int b = 1;
        int c = 0;
        ArrayList<Integer> number = new ArrayList<Integer>();
        for(int i = 0; i < 20; i++) {
            c = a + b;
            a = b;
            b = c;
            number.add(c);
        }
        System.out.println(number);
    }
}
