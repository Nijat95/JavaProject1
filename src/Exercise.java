public class Exercise {

    int fibonacci(int num) {
        if (num == 1 || num == 2) {
            return 1;
        }
        return fibonacci(num - 1) + fibonacci(num - 2);
    }

    public static void main(String[] args) {
        Exercise ex = new Exercise();
        System.out.println(ex.fibonacci(34));
    }
}
