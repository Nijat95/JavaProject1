
import java.util.Scanner;

public class W303 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("What is the temperature outside today? ");
        float temp = sc.nextFloat();

        // above 30 go to the beach
        // between 25 and 30 wear a t-shirt
        // between 15 and 20 wear a jacket
        // below 15 wear a coat
        /*
      if (temp > 30) {
            System.out.println("Go to the beach and enjoy");
        } else if (temp >= 20 && temp <= 30) {
            System.out.println("Wear a t-shirt");
        } else if (temp >= 15 && temp <= 20) {
            System.out.println("Wear a jacket");
        } else if (temp < 15) {
            System.out.println("Wear a coat");
        }

        System.out.println("Which Generation are you? Enter YOB: ");
        int YOB = sc.nextInt();
        if (YOB >= 1946 && YOB <= 1964) {
            System.out.println("You are Baby Boomer");
        } else if (YOB >= 1965 && YOB <= 1980) {
            System.out.println("You are Generation X");
        } else if (YOB >= 1981 && YOB <= 1996) {
            System.out.println("You are Millenial");
        } else if (YOB >= 1997 && YOB <= 2009) {
            System.out.println("You are Generation Z");
        } else if (YOB >= 2010) {
            System.out.println("You are Generation A");
        } else
            System.out.println("Incorrect Value");
        System.out.println("What Year are you Born?");
        int year = sc.nextInt();
        int age = 2022 - year;
        if(age >= 21){
            System.out.println("Customer is eligible to buy alcohol");
        }else if(age < 21 && age <= 100){
            System.out.println("Customer is not eligible to buy alcohol");
        }else{
            System.out.println("Invalid input");
        }
    }

       /* System.out.println("What is your Exam Score?");
        float score = sc.nextFloat();
        if(score >=90 && score <= 100){
            System.out.println("Your Grade is A");
        }else if(score >= 80 && score <= 89){
            System.out.println("Your Grade is B");
        }else if(score >= 70 && score <= 79){
            System.out.println("Your Grade is C");
        }else if(score >= 60 && score <= 69){
            System.out.println("Your Grade is D");
        }else if(score < 60){
            System.out.println("Your Failed");
        } else{
            System.out.println("Invalid input");
        }
        */
        System.out.println("Please enter mid term exam score: ");
        float midTermScore = sc.nextFloat();
        System.out.println("Enter the Final Exam Score: ");
        float finalExamScore = sc.nextFloat();
        float avgScore = (float) ((midTermScore*0.5) + (finalExamScore*0.5));
        System.out.println(avgScore);

    }
}

