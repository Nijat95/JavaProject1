import java.util.Scanner;

public class SwitchStatement {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        // switch
    /*
        int number = 4;
        switch (number) {
            case 1:
                System.out.println(1);
                break;
            case 2:
                System.out.println(2);
                break;
            case 3:
                System.out.println(3);
                break;
            default:
                System.out.println("non was found");
        }

         */

        // ask user to enter a char
        // write java code (switch statement) to find out if the char is vowel or cons
        // Aa Ee Uu Oo Ii
     /*
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a char: ");
        char c = sc.next().charAt(0);
        switch (c) {
            case 'a':
            case 'A':
            case 'e':
            case 'E':
            case 'u':
            case 'U':
            case 'o':
            case 'O':
            case 'i':
            case 'I':
                System.out.println(c + " is a vowel:");
                break;
            default:
                System.out.println(c + " is a constant");////;


        }
        if (c == 'A'|| c == 'a' || c == 'E' || c == 'e' || c == 'U' || c == 'u' || c == 'O' || c == 'o' || c == 'I' || c == 'i'){

        System.out.println(c + " is a Vowel : fom If ");
    }else

    {
        System.out.println(c + " is a constant");
    }

       */
        /*
        System.out.println("Enter a number between 1 and 7");
        int num1 = sc.nextInt();
        switch (num1) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Sunday");
                break;
            case 7:
                System.out.println("Sunday");
                break;

            default:
                System.out.println("Incorrect Value");
        }
        */
        /*
        System.out.println("Enter a number between 1 and 12");
        int number1 = sc.nextInt();
        switch (number1) {
            case 1:
            case 2:
            case 12:
                System.out.println("Winter");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Spring");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Summer");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Autum");
                break;
            default:
                System.out.println("Invalid month");
        }

        */
        System.out.println("Please enter a Grade: ");
        char G = sc.next().charAt(0);
        switch (G) {
            case 'A':
            case 'a':
                System.out.println("Excellent");
                break;
            case 'B':
            case 'b':
                System.out.println("Great!");
                break;
            case 'C':
            case 'c':
                System.out.println("Okay");
                break;
            case 'D':
            case 'd':
                System.out.println("You can do bettter");
                break;
            case 'F':
            case 'f':
                System.out.println("You really messed up");
                break;
            default:
                System.out.println("Invalid Grade");


        }

    }

}