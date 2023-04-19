package llcollection;

import java.util.Collections;
import java.util.LinkedList;
import java.util.Scanner;

public class Computers {

    public static void main(String[] args) {
        /*LinkedList<String> comps = new LinkedList<>();
        comps.add("MacBook Air is the Lightest laptop");
        comps.add("MacBook Pro has best processor");
        comps.add("HP is the choice of Tom Cruise");
        comps.add("Dell is the best for gaming");

        Scanner sc = new Scanner(System.in);
        System.out.println("Google it: ");
        String userInput = sc.nextLine();

        if(userInput.contains("MacBook")) {
            System.out.println(comps.getFirst());
            System.out.println(comps.get(1));
        } else if (userInput.contains("HP")){
            System.out.println(comps.get(2));
        } else if (userInput.contains("Dell")){
            System.out.println(comps.get(3));
        }
        */
        LinkedList<String> Jobs = new LinkedList<String>();
        Jobs.add("Plumber");
        Jobs.add("Truck Driver");
        Jobs.add("Engineer");



        Scanner sc = new Scanner(System.in);
        System.out.println("What do you like in Your Job? : ");
        String UserInput1 = sc.nextLine();

        if(UserInput1.contains("Pain")) {
            System.out.println(Jobs.getFirst());
            //System.out.println(Jobs.get(1));
        } else if (UserInput1.contains("Long Work Hours")){
            System.out.println(Jobs.get(2));
        } else if (UserInput1.contains("Going Insane")){
            System.out.println(Jobs.get(3));
        }

        LinkedList<String> combined = new LinkedList<String>();
        combined.addAll(Jobs);
        System.out.println("Combined items of all jobs: " + combined);

        Collections.sort(combined);
        System.out.println(combined);

        Collections.shuffle(combined);
        System.out.println(combined);



    }

}
