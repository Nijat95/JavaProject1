package CollectionFrameWorks;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MapClassDay2 {

    public static void main(String[] args) {


        Map<String, String> countries = new HashMap<String, String>();

        // put() = add(): adds values to the Map
        countries.put("US", "United States");
        countries.put("ESP", "Spain");
        countries.put("UK", "United Kingdom");
        countries.put("BRZ", "Brazil");
        countries.put("GER", "Germany");

        //System.out.println(countries.get("UK"));

        Map <Integer, Character> alphabet = new HashMap<Integer, Character>();
        int x = 1;

        for(int i = 'A'; i <= 'Z'; i++) {
            alphabet.put(x++,(char)i);

        }
        //System.out.println(alphabet.get(1));

        //{1=10, 2=20, 3=30, 4=40, 5=50}

        Map<Integer, Integer> numbers = new HashMap<Integer, Integer>();

        /*int y = 1;
        for(int i = 10; i <= 50; i+=10) {
            numbers.put(y++,i);
        }
        System.out.println(numbers);*/

        /*Map<Integer, Integer> numbers2 = new HashMap<Integer, Integer>();
        int time = 1;

        while(time < 6){
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter a number # " + time + " => ");

            numbers2.put(time,sc.nextInt());
            time++;

        }
        System.out.println(numbers2);*/
        // ask user to enter 5 product name & price
        // add all values in a Map collection
        // String, double
        // item_name , price
        //print all of the values
        //print total price
/*
        System.out.println("Product name.................$" + 12);

        Map<String,Double> checkOut = new HashMap<String,Double>();
        int i = 0;
        String product_name;
        double price;
        Scanner sc = new Scanner(System.in);
        while(i <= 5){

            System.out.print("enter a Product: ");
            product_name = sc.nextLine();
            sc.nextLine();
            System.out.print("Enter a Price: ");
            price = sc.nextDouble();
            checkOut.put(product_name,price);
            i++;
        }
        System.out.println(checkOut);*/

        System.out.println(countries);
        countries.remove("US");
        System.out.println(countries);

        Map<Integer,String> languages = new HashMap<Integer,String>();
        languages.put(1,"Java");
        languages.put(2,"Java Script");
        languages.put(3,"C#");
        languages.put(4,"C++");
        languages.put(5, "Python");

        for(Map.Entry pl : languages.entrySet()){
            System.out.println(pl.getKey() + " : " + pl.getValue());

        }
    }
}
