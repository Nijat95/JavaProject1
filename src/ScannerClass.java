import java.sql.SQLOutput;
import java.util.Scanner;

public class ScannerClass {

    public static void main(String[] args) {
        // create instance (object) from Scanner Class
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");

        //String name =  sc.nextLine();
        //System.out.println("Your name is " + name);
        System.out.print("Enter a number one : ");
        int number1  = sc.nextInt();
        System.out.print("Enter a number two: ");
        int number2 = sc.nextInt();
        System.out.println(number1 + number2);

        int result = number1 + number2;
        System.out.println("Result is: " + result);


    }




}
