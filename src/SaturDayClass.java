
import java.util.Scanner;
public class SaturDayClass {

    public static void main(String[] args) {
        // calculate the sum of daily grocery shopping
        // create var with diff data type and sum all items
        //byte, short, int, long ,float, double

        Scanner sc = new Scanner(System.in);

       /* System.out.println("Welcome to Costco Shop!");

       System.out.print("Bread......: ");
       //bread
       byte breadPrice = sc.nextByte();

       //milk
        System.out.print("Milk......:");
        int milkPrice = sc.nextInt();

        //eggs
        System.out.print("Eggs...... ");
        float eggPrice = sc.nextFloat();

        //juice
        System.out.print("Juice...... ");
        long juicePrice = sc.nextLong();

        //cheese
        System.out.print("Cheese...... ");
        double cheesePrice = sc.nextDouble();

        float total = (float)(breadPrice + milkPrice + eggPrice +juicePrice +cheesePrice);
        System.out.println("The total is " + total);
      */
        //Write program to convert f to c
        /*System.out.print("Please Enter temperature in F: ");
        float userInput = sc.nextFloat();

        float celsius = (float)((5 * (userInput -32.0))/9.0);
        System.out.println(userInput + "F is " + celsius + "C");
        */
        //Write a Java Program that calculate the age of the user

        /* System.out.println("Please enter the year you were born: ");
        int yearBorn = sc.nextInt();
        System.out.println("Please enter the current year: ");
        int currentYear = sc.nextInt();
        int age = currentYear - yearBorn;
        System.out.println("You are " + age + " years old");
        */

        //write Java program that convert inches to meter
        //forumla = meter = inch * 0.0254

        //System.out.print("Please enter the inch amount to convert to meter: ");
       //float inchAmount = sc.nextFloat();
       // float meterAmount = (float) ((inchAmount * 0.0254));
       // System.out.println("The Amount in meters is " + meterAmount);

        //write Java program that aks users to input 2 numbers (int, double)
        // find the sum, difference, product

        /*System.out.println("Lets find the sum of 2 numbers ");
        System.out.print("Please enter number 1");
        int numberOne = sc.nextInt();
        System.out.print("Please enter value 2");
        double numberTwo = sc.nextDouble();

        double sum = numberOne + numberTwo;
        double difference = numberOne - numberTwo;
        double product = numberOne * numberTwo;
        double division = numberOne / numberTwo;
        int remainder = (int)(numberOne % numberTwo); //5 % 3 = 2; 6 % 3 = 0 modules

        System.out.println("The sum is " + sum);
        System.out.println("The difference is " + difference);
        System.out.println("The Product is " + product);;
        System.out.println("The Division is " + division);
        System.out.println("The Remainder is " + remainder);
          */

        // write Java program that takes input from User in minutes
        // and converts minutes into years and days
        // formula minInAYear = 60 * 24 * 365

        /*System.out.println("Enter the number of minutes youd like to convert");
        int minutes = sc.nextInt();
        int minInAYear = 60 * 24 * 365;
        int years = minutes/minInAYear;
        System.out.println(minutes + "Is aprrox equial to " + years + " years");


         */

        //calculate BMI
        //formula BMI = kg/n2

        /*System.out.println("Please Enter weight: ");
        double weight = sc.nextDouble();
        System.out.println("Please enter height: ");
        double height = sc.nextDouble();
        double bmi = weight/(height * height);
        System.out.println("Your weight is " + weight + " your height is " + height + " bmi is " + bmi);
        */
        //break 5 digit int number into seperate numbes
        //12345 should be converted into 1, 2, 3, 4, 5
       /* System.out.println("Please enter 5 digit whole number: ");
        int ex1 = sc.nextInt();
        int n1 = ex1/10000 % 10;
        int n2 = ex1/1000 % 10;
        int n3 = ex1/100 % 10;
        int n4 = ex1/10 % 10;
        int n5 = ex1 % 10;
        System.out.println(n1 + ", " + n2 + ", " + n3 + ", " + n4 + ", " + n5);





        */
        /* int x1 = 32, x2 = 2, x3 = 3, x = 5;
        System.out.println(x1 % x2); // 32 / 2 = 16 + 0
        System.out.println(x1 % x3); // 32 / 3 = 10 * 3 + 2
        System.out.println(x1 % x); // 32 / 5 = 5 * 6 + 2
        System.out.println(32 % 10); // 32 / 10 = 2
        */
        // write a Java program that asks a user to enter a number
        // and check whether the entered number is even or odd

        /*
        System.out.print("Please enter any 2 digit number:");
        int num = sc.nextInt();
        int remainder = num % 2; //if 0 then it is even number, if 1 then it is odd number
        boolean evenNumber = remainder == 0;
        boolean oddNumber = remainder == 1;
        System.out.println("Is " + num + " an even number? A: "+ evenNumber);
        System.out.println("Is " + num + " an odd number? A: " + oddNumber);

        System.out.println(10 % 5); // 10/5 = 2 * 5 + 0
        System.out.println(0 % 2); // 9 / 2 = 3 * 2 + 1
        System.out.println(5 % 5); //0
        System.out.println(3 % 2);; // 1
        System.out.println(5 % 4); // 1
        System.out.println(13 % 10);
        */

        int a1 = 78;
        int a2 = 90;
        boolean b1 = a1 == a2;
        System.out.println(b1);

        boolean b2 = a1 < a2;
        System.out.println(b2);

        boolean b3 = a1 != a2;
        System.out.println(b3);






    }
}
