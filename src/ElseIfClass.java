import java.util.Scanner;

public class ElseIfClass {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /*int x = 110;
        int y = 20;
        if (x > y) {
            System.out.println(x + " is larger");
        }else if(x == y){
            System.out.println("Numbers are equal!");
        }else{
            System.out.println(y + " is larger");
        }

        int number1 = 110; // 1 > 2 && 1 > 3
        int number2 = 30; // 2 > 1 && 2 > 3
        int number3 = 110; // 3 > 2 && 3 > 1

        if(number1 >  number2 && number1 > number3){
            System.out.println(number1 + " is the largest!");
        }else if(number2 > number1 && number2 > number3){
            System.out.println(number2 + " is the largest!");
        }else if(number3 > number1 && number3 > number2){
            System.out.println(number3 + " is the largest!");
        }else{
            System.out.println("numbers are equal!");
        }

        // asl user to enter a number between 1-7
        //and if number is :
        //1 Print Monday
        //2 Print Tuesday
        //3 Wednesday
        //4 Thursdau
        // ... 7 Print SUnday
        // else : Print Invalid Number

        System.out.print("Enter a number between 1 - 7: ");
        int Day = sc.nextInt();
        int Monday = 1;
        int Tuesday = 2;
        int Wednesday = 3;
        int Thursday = 4;
        int Friday = 5;
        int Saturday = 6;
        int Sunday = 7;

        if(Day == Monday){
            System.out.println("Monday");
        }else if(Day == Tuesday){
            System.out.println("Tuesday");
        }else if(Day == Wednesday){
            System.out.println("Wednesday");
        }else if(Day == Thursday){
            System.out.println("Thursday");
        }else if(Day == Friday){
            System.out.println("Friday");
        }else if(Day == Saturday){
            System.out.println("Saturday");
        }else if(Day == Sunday){
            System.out.println("Sunday");
        }else{
            System.out.println("Invalid Number");
        }

       */
        /*
        int evenCount = 0;
        int oddCount = 0;

        System.out.println("Enter number one : ");
        int num1 = sc.nextInt();
        System.out.println("Enter number two : ");
        int num2 = sc.nextInt();
        System.out.println("Enter number three : ");
        int num3 = sc.nextInt();
        System.out.println("Enter number four : ");
        int num4 = sc.nextInt();
        System.out.println("Enter number five : ");
        int num5 = sc.nextInt();

        if(num1 % 2 == 0){
            evenCount++;

        }else{
            oddCount++;
        }
        if(num2 % 2 == 0){
            evenCount++;

        }else {
            oddCount++;
        }
        if(num3 % 2 == 0){
            evenCount++;

        }else {
            oddCount++;
        }
        if(num4 % 2 == 0){
            evenCount++;

        }else {
            oddCount++;
        }
        if(num5 % 2 == 0) {
            evenCount++;
        }else
            oddCount++;

        System.out.println("Total even: " + evenCount);
        System.out.println("Total odd: " + oddCount);

        */
        System.out.println("Please Enter weight: ");
        double weight = sc.nextDouble();
        System.out.println("Please enter height: ");
        double height = sc.nextDouble();
        double bmi = weight/(height * height);

        if(bmi > 18.5 && bmi < 25) {
            System.out.println("Your Normal Weight");
        }else if(bmi >= 30){
            System.out.println("You're obese");
        }else if(bmi < 18.5){
            System.out.println("You're Under Weight");
        }else if(bmi > 25 && bmi < 30){
            System.out.println("You're Overweight");
        }





    }
}
