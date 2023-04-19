package VectorNstack;

import java.util.ArrayList;
import java.util.Vector;

public class VectorPractice {
    public static void main(String[] args) {

        Vector<String> mammals = new Vector<>();
        mammals.add("Dog");
        mammals.add("Elephant");

        System.out.println("Mammals original list" + mammals);

        mammals.add(0,"Cat");
        System.out.println("Mammals list after adding a cat: " + mammals);

        ArrayList<String> arrayList = new ArrayList<>();
        // create another vector with atleast 3 elements and concatinate with mammals using addAll

        Vector<String> cars = new Vector<>();
        cars.add("Audi");
        cars.addAll(mammals);
        System.out.println(cars);
        System.out.println(cars.capacity() + " is the capacity for 4 exisitng elements " + cars.size());

        cars.add("VW");
        cars.add("Mercedes");
        cars.add("Mitsubishi");
        cars.add("Lamborghini");
        cars.add("Bmw");
        cars.add("Honda");
        cars.add("Chevrolet");
        cars.addElement("Ferrari");

        System.out.println(cars.size() + " is the size of cars\n" + cars.capacity() + " is the new capacity ");
        System.out.println(cars.contains("Honda"));

        String removedCar = cars.remove(5);
        System.out.println(removedCar + " is the removed car");
        System.out.println(cars);





    }
}
