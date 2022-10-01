import java.util.Scanner;

public class NestedIfElseReview {

    public static void main(String[] args) {
        // Create 2 string variables for the username and passwprd
        // write a program that asks from the user to enter username




        String username = "Admin";
        String password = "admin123";

        Scanner sc = new Scanner(System.in);
       /* System.out.println("Enter username: ");
        String usernameFromUser = sc.nextLine();

        if (usernameFromUser.equals(username)){

            System.out.println("Enter password: ");
            String passwordFromUser = sc.nextLine();
            if(passwordFromUser.equals(password)){
                System.out.println("Login Successful!: ");
            }else{
                System.out.println("Wrong password");
            }

        }else{
            System.out.println("Invalid username");
        }
    */
        // ask user to enter a number 1 - 4
        // if number is not between 1 - 4 Print Invalid Number
        // if number is 1 - 4 then check if it is 1: print Spring
        //IF it is 2 print Summer
        // if its 3 print Autumn
        // if its 4 print Winter

        System.out.println("Enter a number between 1-4: ");
        int number = sc.nextInt();
        if(number > 0 && number <= 4){
            if(number == 1) {
                System.out.println("Spring");
            }else if(number == 2){
                System.out.println("Summer");
            }else if(number == 3){
                System.out.println("Autumn");
            }else if(number == 4){
                System.out.println("Winter");
            }
        }else{
            System.out.println("Invalid Number! ");
        }



    }
}
