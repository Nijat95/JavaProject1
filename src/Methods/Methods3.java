package Methods;

import java.util.Scanner;



public class Methods3 {

    //create a method that return the largest number among 3 numbers that user entered
    //non - static vs static
    //create a method that checks if the user entered a number that is odd or even
    public static void main(String[] args) {
        Methods3 md3 = new Methods3();
        Scanner sc = new Scanner(System.in);
        Methods md = new Methods();
        md.multiply(4,60);
       System.out.println(getMaxNumberOf(1,0,0));
        double d1 = md3.smallest(3.5,6.5,7.5);
        System.out.println(d1);
        // calling static method
        System.out.println(evenNumber(463456));
        // calling non-static method
        System.out.println(md3.oddNumber(46546));

        System.out.println("\n");
        System.out.println("Are you a US citizen? Y/N");
        String usCitizen = sc.nextLine().toLowerCase();
        System.out.print("Please enter your yob: ");
        int yob = sc.nextInt();

        eligibleToVote(usCitizen, yob);
        char grade = gradeLetter(79.8);
        System.out.println(grade);
        md3.AddSubtract(7,8);


    }
    public static int getMaxNumberOf(int x, int y, int z) {
        if (x > y && x > z ){
            return x;
        }else if (y > x && y > z){
            return y;
        }else if (z > x && z > y){
            return z;
        }else{
            return 0;
        }

    }

    public static boolean evenNumber(int x){
        if(x % 2 == 0){
            return true;
        }
        return false;
    }

    public boolean oddNumber(int x){
        if(x % 2 == 1){
            return true;
        }else{
            return false;
        }
    }



    public double smallest(double x, double y, double z) {
        if (x < y && x < z) {
            return x;
        } else if (y < x && y < z) {
            return y;
        } else if (z < x && z < y) {
            return z;
        } else {
            return 0;
        }
    }

    // create a method that checks if the customer is US citizen eligible to vote
    //18yo
    // void and static vs non-static
    public static void eligibleToVote(String str, int yob){
        int age = 2022 - yob;
        if(str.contains("y") && age >=18){
            System.out.println("You are eligible to vote");
        }else{
            System.out.println("You are not eligible to vote");
        }
    }

    // create a method that takes one parameter and returns a letter grade
    // 90 - 100 A
    // 80 - 89 B
    // 70 - 79 C
    // 60 - 69 D
    // >60 then F

    public static char gradeLetter(double examScore) {
        if (examScore >= 90 && examScore <= 100){
            return 'A';
        } else if (examScore >= 80 && examScore <= 89.9) {
            return 'B';
        } else if (examScore >= 70 && examScore <= 79.9) {
            return 'C';
        } else if (examScore >= 60 && examScore <= 69.9) {
            return 'D';
        } else{
            return 'F';
        }

    }

    public int AddSubtract(int x, int y){
        x = 0;
        y = 1;
        int z;
        z = x + y;
        return z;
    }


}
