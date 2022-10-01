import java.util.Locale;
import java.util.Scanner;

public class MyLoops {
    public static void main(String[] args) {
        /*int i = 0;

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

         */

       /* for (int i = 0; i < 5; i++) {
            System.out.println(i + " for loop is being executed");
        }

        */

        Scanner sc = new Scanner(System.in);
       /* System.out.println("Please enter any number between 0 and 20: ");

        int userInput = sc.nextInt();

        for(int i = 0; i <= 20; i++) {
            if(i == userInput) {
                System.out.println(i + " is the number you guessed");
            }
        }

        */

        System.out.print("Please write your name: ");
        String userName = sc.nextLine();

     /*   for(int i = 0; i < 5; i++) {
            System.out.println(userName);
        }

      */
        for(int i = 0; i < userName.length(); i++) {
            System.out.println(userName.charAt(i));

        }

        for(int i = 0; i < userName.length(); i++) {

            char x = userName.charAt(i);
            String y = String.valueOf(x).toUpperCase(Locale.ROOT);
            System.out.println(y);

        }


    }
}
