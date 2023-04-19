package Exceptions;

import java.sql.SQLOutput;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionClass {



    public static void main(String[] args) {

       // stringoutofboundsException
        String str = "Java";
        //System.out.println(str.charAt(5));

       // int [] i = {1,22,33,55,77,100};
        //System.out.println(i[8]);

        try {
            int [] i = {1,22,33,55,77,100};
            System.out.println(i[8]);
        }catch (Exception e){
            System.out.println("If this happens check array length : > " + e.getMessage());
        }finally {
            System.out.println("First try & catch block is one ");
        }

        try{
            System.out.println(str.charAt(10));
        }catch (Exception e){
            System.out.println("OOps something went wrong ");
            System.out.println(e.getMessage());
        }finally {
            System.out.println("2nd one isdone too!");
        }

            try{
                Scanner input = new Scanner(System.in);
                System.out.println("Enter a number");
                String i = input.nextLine();
                System.out.println("your number is " + i);
                System.out.println(i.charAt(10));
            }catch (Exception e){
                System.out.println("You entered a wrong data, Please try again later!");
                System.out.println(e.getMessage());
            }finally {
                System.out.println("3rd one is done as well!");
            }

            // go to google.com
            // enter "Iphone" in search box
            // put try execute another time if it doesnt execture



    }



}
