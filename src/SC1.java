
import java.util.Scanner;
public class SC1 {

    public static void main(String[] args) {

        Scanner sc1 = new Scanner(System.in);
       /*0 System.out.println("HI, I need your age to figure out the current year ");
        int age = sc1.nextInt();
        System.out.println("Enter Year you were born ");
        int yearborn = sc1.nextInt();
        int currentyear = (age + yearborn);
        System.out.println("Current Year is " + currentyear);
        */

        System.out.println("Enter Hours to convert to seconds:  ");
        double hours = sc1.nextDouble();
        System.out.println("Enter Minutes to convert to seconds:  ");
        double minutes = sc1.nextDouble();
        System.out.println("Enter Seconds ");
        double seconds = sc1.nextDouble();

        double totaltimeinseconds = (hours * 3600) + (minutes * 60) + seconds;
        System.out.println("Total Time in seconds: " + totaltimeinseconds);




    }


}
