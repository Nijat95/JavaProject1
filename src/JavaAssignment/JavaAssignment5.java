package JavaAssignment;

import java.util.Scanner;

public class JavaAssignment5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please Enter 3 Numbers to see if they are equal");
        System.out.println("Enter First Number: ");
        int a = sc.nextInt();
        System.out.println("Enter Second Number: ");
        int b = sc.nextInt();
        System.out.println("Enter Third Number: ");
        int c = sc.nextInt();

        if (a == b &&  b == c) {
            System.out.println("All numbers are equal");
        }else if (a != b && b != c) {
            System.out.println("All numbers are different");
        }else if(a == b && b != c || b == c && a != b) {
            System.out.println("Neither all are equal or different");
        }else{
            System.out.println("Invalid input");
        }


    }
}
