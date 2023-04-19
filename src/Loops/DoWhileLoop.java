package Loops;

import java.util.Scanner;

public class DoWhileLoop {
    public static void main(String[] args) {

        // 1, ... 10;
        int i = 1;

        while (i <= 10) {
            System.out.println(i);
            i++;
        }
        i = 1;

        do {
            System.out.println(i);
            //code
            i++;
        } while (i <= 0);


        i = 1;

        do {
            System.out.println("Nijat");
            i++;
        } while (i <= 10);

        // ask user to enter a number
        // print x number your name


        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = sc.nextInt();
        int start = 1;
        while (start <= num) {
            System.out.println("Nijat");
            start++;


            do {
                System.out.println("Nijat " + start);
                start++;
            } while (start <= num);


            i = 1;
            while (i <= 3) {
                System.out.println("Enter a number: ");
                int number = sc.nextInt();
                if (number >= 5 && number <= 10) {
                    System.out.println("You got it");
                    break;
                } else {
                    i++;
                    System.out.println("Try Again!");
                }


            }
            if (i == 4) {
                System.out.println("Game Over");
            }


        }
    }
}
