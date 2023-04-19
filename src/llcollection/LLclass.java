package llcollection;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.LinkedList;

public class LLclass {
    public static void main(String[] args) {
       /* ArrayList<String> arPets = new ArrayList<String>();
        arPets.add("Dog");
        arPets.add("Cat");
        arPets.add("GuneaPig");
        arPets.add("Fish");
        arPets.add("Tiger");
        System.out.println(arPets);

        LinkedList<String> llPets = new LinkedList<String>();
        llPets.add("Dog");
        llPets.add("Cat");
        llPets.add("GuneaPig");
        llPets.add("Fish");
        llPets.add("Tiger");
        //System.out.println(llPets);

        //create a linked lisrt of company names

        LinkedList<String> Companies = new LinkedList<String>();
        Companies.add("Apple");
        Companies.add("IBM");
        Companies.add("Windows");
        Companies.add("FaceBook");
        Companies.add("Google");
        //System.out.println(Companies);
        Companies.add(1,"Samsugn");

        for(String company :Companies){
            System.out.println(company);
        }

        for(String llPet :llPets){
            System.out.println(llPet);
        }

        LinkedList<String> Languages = new LinkedList<String>();
        Languages.add("Java");
        Languages.add("JavaScript");
        Languages.add("Python");
        Languages.add("C++");

        for(String languages :Languages){
            System.out.println(languages);
        }
*/
        //create a linked list
        // use addFirst(), addLast
        //getFirst(), getLast


        LinkedList<String> Movies = new LinkedList<String>();
        Movies.add("Top Gun");
        Movies.add("Avatar");
        Movies.add("Pearl Harbor");
        Movies.add("Wolf Of Wal Street");
        Movies.addFirst("Home Alone");
        Movies.addLast("Fifty Shades of Gray");
        System.out.println(Movies.getFirst());
        System.out.println(Movies.getLast());

        //create a linkedlist of shapes
        //get inedx and print out items

        LinkedList<String> Shapes = new LinkedList<String>();
        Shapes.add("Square");
        Shapes.add("Circle");
        Shapes.add("Triangle");
        Shapes.add("Oval");
        Shapes.add("Rectangle");

        for(int i = 0; i < Shapes.size(); i++){
            System.out.println("At index " + i + ": " + Shapes.get(i));
        }






    }


}
