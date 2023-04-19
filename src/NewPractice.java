import java.util.Scanner;

public class NewPractice {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x = 0;
        do {
            System.out.println("Enter a Number 1-7");
            int a = sc.nextInt();
            switch (a) {
                case 0:
                    System.out.println("Number Zero");
                    break;
                case 1:
                    System.out.println("Number One");
                    break;
                case 2:
                    System.out.println("Number Two");
                    break;
                case 3:
                    System.out.println("Number Three");
                    break;
                case 4:
                    System.out.println("Number Four");
                    break;
                case 5:
                    System.out.println("Number Five");
                    break;
                case 6:
                    System.out.println("Number Six");
                    break;
                case 7:
                    System.out.println("Number Seven");
                    break;
                default:
                    System.out.println("Number Unknown");

            }
            x++;
        } while (x < 5);
    }
}
