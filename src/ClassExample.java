public class ClassExample {

    //instance variables
    int x;
    double y;
    String str;

    // class variables
    static int x1;
    static double y1;

    public void sum(int x, int y) {
        // local variables
        System.out.println(x+y);
    }
    public void sum2() {
        System.out.println(this.x + this.y);
    }

    class Example2{
        public static void main(String[] args) {
            ClassExample ce = new ClassExample();
            ce.str = "Example";
            ce.x = 45;

            //method1
            ce.sum(3, 6);

            //method 2
            ce.sum2();

        }

    }
}
