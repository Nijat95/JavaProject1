import java.util.Scanner;

public class IfElseClass {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        if (5 > 6){

            System.out.println("True");

        }


        if (10 == 10){
            System.out.println(true);

        }

        int x = 30;
        int y = 20;
        if(x > y){
            System.out.println("X is larger! ");
        }

        String password = "admin123";
        if(password == "admin123"){
            System.out.println("Correct Password!");

        }

        // Odd or Even
        // 5      6
        //Forumla : if / a number by 2 -> 0 it is even number
        //                if the result is 1 it's odd number

        int num = 10;
        if( num % 2 == 0){
            System.out.println("This is an even number");
        }else{

            // odd numbers
            System.out.println("This is an odd number");
        }

        if(true) {
            //do this
        }else{
            //do this
        }
         /*
        // ask user to enter a number
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        // write java code to find out if the number is even or odd
        if( number % 2 == 0){
            System.out.println(number + " is an even number");
        }else{
            System.out.println(number + " is an odd number");
        }

         */
        // ask user to enter YOB
        //wrote java code to find out his / her age
        // if the age is > 65 print : You are retired
        //else print : you are not retired

        System.out.println("Enter your Year of Birth: ");
        int YOB = sc.nextInt();
        int age = 2022 - YOB;
                if(age > 65){
                    System.out.println("You are " + age + " and retired");
                }else{
                    System.out.println("You are " + age + " and not retired");
                }

    }


}




