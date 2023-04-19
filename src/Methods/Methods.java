package Methods;

import java.util.Scanner;

public class Methods {
    public static void main(String[] args) {

        int x1 = 5;
        int y1 = 10;
        System.out.println(x1 + y1);

        int x2 = 4340;
        int y2 = 5340;
        System.out.println(x2 + y2);

        int x3 = 56;
        int y3  = 34;
        System.out.println(x3+ y3);

        System.out.println("Add method is called: ");
        add(456,678);
        add(500,2300);
        System.out.println("Subtract method is called: ");
        subtract(800,378);

        Methods md = new Methods();
        md.multiply(34,23);
        md.division(50,5);
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        userName(name);




        userAge(1988);
        System.out.println(add2(45, 67));

        int max = max(34,23,46,34);
        System.out.println(max);

        palindrome("kayak");
        int x = vowelCount("kayak");
        System.out.println(x);

        System.out.println(average(5,7,4));
    }
    // sum
    public static void add(int x, int y) {
        System.out.println(x + y);
    }
    public static void subtract(double x, double y) {
        System.out.println(x - y);
    }
    //multiply
    public void multiply(int x, int y) {
        System.out.println(x * y);
    }

    public void newLine(){
        System.out.println();
    }

    //divide
    public void division(int x, int y) {
        System.out.println(x / y);
    }


    public static void userName(String name) {
        System.out.println("the user name is " + name);
        System.out.println("the age of the user is 25");
        userAge(1988);
        System.out.println(add2(45, 67));
    }

    // create a method that takes the yob of the user and calculates the age
    public static void userAge(int yob) {
        System.out.println(2022 - yob);

    }

    public static int add2(int x, int y) {
        return x + y;
    }

    public static boolean bool(int x, int y) {
        int sum = x + y;
        return sum == 0;
    }
    // create a method that returns the largest number among 4 numbers
    public static int max(int x, int y, int z, int a){
        if(x > y && x > z && x > a){
            return x;
        }else if(y > x && y > z && y > a){
            return y;
        }else if(z > x && z > y && z > a){
            return z;
        }else if(a > x && a > y && a > z){
            return a;
        }return 0;
    }
    // create a method that takes one parameter,
    // and returns the number of vowel characters (a, e, u, o, i)
    public static int vowelCount(String str){

        int count = 0;
        String str2 = str.toLowerCase();
        for(int i = 0; i < str.length(); i++){
            if(str2.charAt(i) == 'a' || str2.charAt(i) == 'e' || str2.charAt(i) == 'u' || str2.charAt(i) == 'o' || str2.charAt(i) == 'i'){
                count++;
            }

        }
        return count;


    }


    // palindrome
    public static void palindrome(String word){
        // apple --> elppa
        String reversed = "";
        for(int i = word.length()-1; i>= 0; i--){
            reversed += word.charAt(i);
        }

        if(word.equals(reversed)){
            System.out.println(word + " is a palindrome");

        }else{
            System.out.println(word + " is not a palindrome");
        }
    }
    // create a method that takes 3 numeric parameters and returns the average of those 3 numbers
    // make it a return type
    public static double average( double a, double b, double c){
        double avg = (a + b + c) / 3;
        return avg;
    }
    }


