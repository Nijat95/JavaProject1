package CollectionFrameWorks;

import java.sql.SQLOutput;
import java.util.ArrayList;

public class ArrayListClass {
    public static void main(String[] args) {

        //int [] numbers = new int[10];
        //
        ArrayList <Integer> number1 = new ArrayList<Integer>();

        // add() -> add value to an ArrayList
        number1.add(0);
        number1.add(10);
        number1.add(12);
        number1.add(13);
        number1.add(14);
        System.out.println(number1);


        ArrayList<String> days = new ArrayList<String>();

        days.add("Monday");
        days.add("Tuesday");
        days.add("Wednesday");
        days.add("Thursday");
        days.add("Friday");
        days.add("Saturday");
        days.add("Sunday");
        System.out.println(days);

        ArrayList<Character> abc = new ArrayList<Character>();

        abc.add('a');
        abc.add('A');
        abc.add('B');
        abc.add('C');
        abc.add('D');
        abc.add('E');
        System.out.println(abc);

        ArrayList<Double> number2 = new ArrayList<>();

        number2.add(10.1);
        number2.add(11.3);
        number2.add(12.4);
        number2.add(13.5);
        System.out.println(number2);


        ArrayList<Float> number3 = new ArrayList<>();

        number3.add(20.5f);
        number3.add(30.5f);
        number3.add(40.5f);
        number3.add(50.5f);
        number3.add(60.5f);
        number3.add(70.5f);
        number3.add(80.5f);
        System.out.println(number3);

        //Task
        //Create and ArrayList of Strings called cars
        //add 10 car names & print them all



        ArrayList<String> cars = new ArrayList<String>();

        cars.add("SlowCar");
        cars.add("FunnyCar");
        cars.add("AngryCar");
        cars.add("BraveCar");
        cars.add("StrongCar");
        cars.add("ArrogantCar");
        cars.add("AristocratCar");
        System.out.println(cars);

        ArrayList <Integer> number10 = new ArrayList<Integer>();

        // add() -> add value to an ArrayList
        number10.add(1);
        number10.add(2);
        number10.add(3);
        number10.add(4);
        number10.add(5);
        System.out.println(number10);

        ArrayList<Character> abc1 = new ArrayList<Character>();

        abc1.add('a');
        abc1.add('b');
        abc1.add('c');
        abc1.add('d');
        abc1.add('e');
        System.out.println(abc1);

        // get() -> params: index -> returns an element
        System.out.println(days.get(0) + " " + days.get(1) + " " + days.get(2));
        System.out.println(days.get(1));
        System.out.println(days.get(2));

        System.out.println(number3.get(3));

        System.out.println(abc.get(2));

        // set () params: 1.index & 2. new Value: return Element
        System.out.println("Before: " +days.get(0));
        days.set(0, "NonDay");
        System.out.println("After: " +days.get(0));

        days.add("");
        days.set(7, "New Day");
        System.out.println(days.get(7));

        // remove() removes an element
        System.out.println(days);
        days.remove(0);
        System.out.println(days);
        days.remove(6);
        System.out.println(days);
        days.add(0, "Monday");
        //days.set(0, "Monday");
        System.out.println(days.size());

        days.clear();// No params: removes all ARL elements
        System.out.println(days.size());

        days.size(); // No params: returns number of element(s)




    }

}
