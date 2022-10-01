import java.sql.SQLOutput;
import java.util.Scanner;

public class NestedIfElse {
    public static void main(String[] args) {
        // check if the user entered number if positive and even number
        Scanner sc = new Scanner(System.in);
        /*System.out.println("Please Enter any Number");
        int i = sc.nextInt();

        if(i > 0) {
            if (i % 2 == 0) {
                System.out.println(i + " Is a positive and even number");
            } else {
                System.out.println(i + " Is a positive and odd number");
            }
        }else if(i < 0){
                if(i % 2 == 0){
                    System.out.println(i + " Is a negative and even number");
                }else
                    System.out.println(i + " Is a negative and odd number");
            }else{
            System.out.println("Invalid Input");
        }
         */
        /*System.out.println("Enter  Number1: ");
        int Number1 = sc.nextInt();
        System.out.println("Enter  Number2: ");
        int Number2 = sc.nextInt();
        System.out.println("Enter Number3: ");
        int Number3 = sc.nextInt();

        if (Number1 > Number2) {
            if (Number1 > Number3) {
                System.out.println(Number1 + " Is Greatest number");
            }
        } else if (Number2 > Number3) {
            if (Number2 > Number1) {
                System.out.println(Number2 + " is the Greatest Number");
            }
        } else if (Number3 > Number1) {
            if (Number3 > Number2) {
                System.out.println(Number3 + " is the Greatest Number");
            }
        } else if (Number1 == Number2) {
            if (Number2 == Number3) {
                System.out.println("All numbers are the same");
            } else if (Number2 > Number3) {
                System.out.println(Number3 + " is the smallest Number");
            }

        } else {
            System.out.println("Input Correct Value");
            */
        System.out.println("Enter  Number1: ");
        int Number1 = sc.nextInt();
        System.out.println("Enter  Number2: ");
        int Number2 = sc.nextInt();
        if(Number1 >= Number2){
            if(Number1 > Number2){
                System.out.println(Number1 + " is the largest number");

            }else if(Number1 == Number2){
                System.out.println("Both numbers are equal");
            }
        }else if(Number2 > Number1){
            System.out.println(Number2 + " is the largest number");
        }else{
            System.out.println("Invalid input");
        }
    }
}




