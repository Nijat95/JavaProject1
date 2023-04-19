package Loops;

import java.util.Locale;
import java.util.Scanner;

public class MyLoops {
    public static void main(String[] args) {
        int i = 0;

        do{
            System.out.println(i);
            System.out.println("Do while loop is being executed");
            i++;
            // click on login button
        }while(i < 5); //

        int j = 0;
        while(i < 5) {
            System.out.println(j);
            System.out.println("Do while loop is being executed");
            j++;


        }
        int n = 0;
        do{
            System.out.println("Nijat");
            System.out.println(n);
            n++;
        }while(n < 20);



        for (int i1 = 0; i1 < 5; i1++) {
            System.out.println(i1 + " for loop is being executed");
        }



        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter any number between 0 and 20: ");

        int userInput = sc.nextInt();

        for(int i2 = 0; i2 <= 20; i2++) {
            if(i2 == userInput) {
                System.out.println(i2 + " is the number you guessed");
            }
        }



        System.out.print("Please write your name: ");
        String userName = sc.nextLine();

       for(int i3 = 0; i3 < 5; i3++) {
            System.out.println(userName);
        }


        for(int i4 = 0; i4 < userName.length(); i4++) {
            System.out.println(userName.charAt(i4));

        }

        for(int i5 = 0; i5 < userName.length(); i5++) {

            char x = userName.charAt(i5);
            String y = String.valueOf(x).toUpperCase(Locale.ROOT);
            System.out.println(y);

        }


    }
}
