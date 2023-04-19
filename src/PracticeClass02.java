import java.util.Scanner;

public class PracticeClass02 {
    public static void main(String[] args) {
        // ask the user to enter a year and write java code to find out if the year is leap or not
        // 2016 => divisible by 4, 100, & 400 = 0 = leap year
        Scanner sc = new Scanner(System.in);

        for( int v = 0; v < 10; v++){
            for( int i = 0; i < v; i++){
                System.out.print(v);
            }
            System.out.println();
        }
        System.out.println("\n");

        int x = 1;
        for(int i = 1; i <= 4; i++){
            for( int j = 1; j <= i; j++){
                System.out.print(x++);
            }
            System.out.println("");

        }

        //break

        for(int i = 1; i <= 10; i++){

            if(i == 5){
                break;
            }
            System.out.println("Java is fun!");

        }

        for(int i = 1; i <= 3; i++){

            for(int j = 0; j <=3; j++){
                System.out.println("Inner Loop: Java is fun");
            }
            System.out.println("<    >Outer Loop: Java is fun!");
            if(i == 2){
                break;
            }


            // Continue
            System.out.println("\n");




        }
        System.out.println("\n");
        String str = "Java";
        for(int v = 0; v < str.length(); v++){

            if(str.charAt(v) == 'a'){
                continue;
            }
            System.out.println(str.charAt(v));

        }

       outter: for( int i = 1; i <= 3; i++ ){
            inner :for ( int j = 1; j<=3; j++ ){
                System.out.println("i: " + i + " j: " + j);
                if(i == 2){
                    break;
                }
            }
        }

        // i : 1 j : 1
        // i : 1 j : 2
        // i : 1 j : 3
        // i : 2 j : 1
        // i : 2 j : 2
        // i : 2 j : 3
        // i : 3 j : 1
        // i : 3 j : 2
        // i : 3 j : 3


    }
}
