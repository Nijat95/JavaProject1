import java.util.Scanner;

public class ScannerClass2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        // System.out.print("Enter your Name : ");
       // String name = sc.nextLine();
        //System.out.println("Your name is : " + name);

        System.out.println("Enter a number : ");
        int num = sc.nextInt();
        System.out.println("Enter a number 2:");
        int num2 = sc.nextInt();

        System.out.println(num + num2);
    }
}
