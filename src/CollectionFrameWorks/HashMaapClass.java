package CollectionFrameWorks;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class HashMaapClass {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {


            Map<String, Double> checkOut = new HashMap<String, Double>();
            double totalPrice = 0;
            // ask user to enter 5 product name & price
            //add all values in a Map:
            //String, double
            //item_name, price
            int i = 1;
            while (i <= 5) {
                System.out.print("Enter a product #" + i + " : ");
                String product_name = sc.next();
                System.out.print("Enter a price #" + i + " : ");
                double price = sc.nextDouble();
                totalPrice += price;
                checkOut.put(product_name, price);
                i++;

            }
            // print all values as receipt
            int i2 = 1;
            System.out.println("=========== Store #22 ============");
            for (Map.Entry<String, Double> items : checkOut.entrySet()) {
                System.out.println(i2++ + "." + items.getKey() + "................$" + items.getValue());
            }
            // print total price
            System.out.println("Total price is...............$" + totalPrice);

        } catch (Exception e) {
            System.out.println("Please do not enter a space when entering a product, use _ ");
        }

        // ask user to enter 5 names & their ages
        // add to the map and print all in console


    }
}
