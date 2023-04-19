package Array;

import java.sql.SQLOutput;

public class ArraryClass {
    public static void main(String[] args) {

        String name = "John"; // variable

        String[] names = new String[3]; // this array can hold 3 names

        names[0] = "John";
        names[1] = "Bob";
        names[2] = "Dan";

        // second way to create array

        String [] names2 = {"John", "Bob", "Dan"};



        System.out.println(names[2] + " | " + names2[2]);
        System.out.println(names[1] + " | " + names2[1]);
        System.out.println(names[0] + " | " + names2[0]);


        int [] numbers = new int[5];

        numbers[0] = 10;
        numbers[1] = 20;
        numbers[2] = 30;
        numbers[3] = 40;
        numbers[4] = 50;

        //second way to create array
        int [] numbers2 = {10,20,30,40,50};



        System.out.println(numbers[4] + " | " + numbers2[4]);
        System.out.println(numbers[3] + " | " + numbers2[3]);
        System.out.println(numbers[2] + " | " + numbers2[2]);
        System.out.println(numbers[1] + " | " + numbers2[1]);
        System.out.println(numbers[0] + " | " + numbers2[0]);


        // create string array with 12 memory location [12]
        // assign all 12 months to that arrey

        String[] Months = new String[12];

        Months[0] = "Jan";
        Months[1] = "Feb";
        Months[2] = "Mar";
        Months[3] = "Apr";
        Months[4] = "May";
        Months[5] = "Jun";
        Months[6] = "Jul";
        Months[7] = "Aug";
        Months[8] = "Sep";
        Months[9] = "Oct";
        Months[10] = "Nov";
        Months[11] = "Dec";

        System.out.println("Reg For LOOP: ");
        for (int i = 0; i < Months.length; i++){
            System.out.print(Months[i] + ", ");
        }

        // for - each loop
        System.out.println();
        System.out.println("For each Loop:");
        for(String month : Months){
            System.out.print(month + ", ");
        }


        String[] months2 = {"Jan", "Feb","Mar","Apr","May","Jun","Jul", "Aug","Sep","Oct","Nov","Dec"};

        System.out.println();
        System.out.println(Months[0] + " | " + months2[0]);
        System.out.println(Months[1] + " | " + months2[1]);
        System.out.println(Months[2] + " | " + months2[2]);
        System.out.println(Months[3] + " | " + months2[3]);
        System.out.println(Months[4] + " | " + months2[4]);
        System.out.println(Months[5] + " | " + months2[5]);
        System.out.println(Months[6] + " | " + months2[6]);
        System.out.println(Months[7] + " | " + months2[7]);
        System.out.println(Months[8] + " | " + months2[8]);
        System.out.println(Months[9] + " | " + months2[9]);
        System.out.println(Months[10] + " | " + months2[10]);
        System.out.println(Months[11] + " | " + months2[11]);


        char [] alphabet = new char[5];

        alphabet[0] = 'a';
        alphabet[1] = 'b';
        alphabet[2] = 'c';
        alphabet[3] = 'd';
        alphabet[4] = 'e';

        System.out.println(alphabet[0] + "," + alphabet[1] + "," + alphabet[2] + "," + alphabet[3]);

        float [] floatArray = new float[4];

        floatArray[0] = 20.10f;
        floatArray[1] = 30.20f;
        floatArray[2] = 40.30f;
        floatArray[3] = 50.40f;

        for( float f : floatArray ) {
            System.out.print(f + ", ");
        }

        System.out.println(floatArray[2] + ", " + floatArray[3]);

        System.out.println(numbers[4] + floatArray[3]);

        System.out.println(Months[3] + ":" + alphabet[0]);

        // create a string array called cars
        // and add 10 car names to it
        // print all Values in the console

        String[] carNames = new String[10];

        carNames[0] = "Alfa Romeo";
        carNames[1] = "Bugatti";
        carNames[2] = "Ferrari";
        carNames[3] = "Lamborghini";
        carNames[4] = "Packard";
        carNames[5] = "Detomaso";
        carNames[6] = "Lotus";
        carNames[7] = "Mclaren";
        carNames[8] = "Aston Martin";
        carNames[9] = "Rolls Royce";
        String[] carNames2 = {"Tesla", "Rivian"};

        System.out.println("The most Interesting car Brands In History: " + carNames[0] + ", " + carNames[1]);
        System.out.println(carNames[2] + ", " + carNames[3] + ", " + carNames[4] + ", " + carNames[5]);
        System.out.println(carNames[6] + ", " + carNames[7] + ", " + carNames[8] + ", " + carNames[9]);

    }
}
