package polyM;

public class Exercise1 {
    public static void main(String[] args) {
        Exercise1 ex = new Exercise1();
        System.out.println(ex.multiply(10,10));
        System.out.println(ex.multiply(13.5,13.5));
        System.out.println(ex.multiply(17.5f,17.5f));

    }

    public int multiply(int a, int b) {
        return a * b;
    }
    public double multiply(double a, double b) {
        return a * b;
    }
    public float multiply(float a, float b) {
        return a * b;
    }
}
