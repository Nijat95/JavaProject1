import java.sql.SQLOutput;
import java.util.*;

public class SetInterface {

    public static void main(String[] args) {
        // set

        Set<String> car = new HashSet<>();
        ArrayList<Integer> days = new ArrayList<>();

        List<Integer> daysofWeem = new LinkedList<>();
        car.add("BMW");
        car.add("Benz");
        car.add("Nissan");
        car.add("Honda");
        car.add("Mini");
        car.add("Ford");
        System.out.println("=========>" + car.hashCode());

        System.out.println(car);

        HashSet <String> newCar = new HashSet<String>();
        newCar.addAll(car);
        System.out.println(newCar);

        Iterator allElement = newCar.iterator();

        while(allElement.hasNext()){
            System.out.println(allElement.next());
        }


        car.remove("Nissan");
        System.out.println(car);

        HashSet<Integer> numbers = new HashSet<Integer>();

        for(int i = 0; i <= 100; i+=10){
            numbers.add(i);
        }
        System.out.println(numbers);
        numbers.remove(40);
        System.out.println(numbers);

        HashSet<Character> alphabet = new HashSet<>();
        for(int i = 'A'; i <= 'Z'; i++) {
            alphabet.add((char) i);

        }
        System.out.println(alphabet);
        //alphabet.remove('Z');
        System.out.println(alphabet);
        //alphabet.removeAll(alphabet);
        alphabet.retainAll(alphabet);
        System.out.println(numbers.size());
        numbers.clear();
        System.out.println(numbers);
        System.out.println(numbers.size());

        Set <Integer> evenNUmbers = new HashSet<Integer>();
        for(int i = 0; i <= 3; i++){
            evenNUmbers.add(i);
        }
        System.out.println(evenNUmbers.size());
        System.out.println(evenNUmbers.toArray().length);
        System.out.println(evenNUmbers.contains(22));
        Set <Integer> evenNumbers2 = new HashSet<Integer>();
        for(int i = 0; i <= 50; i+=1){
            evenNumbers2.add(i);
        }
        System.out.println(evenNUmbers);
        System.out.println(evenNumbers2);

        System.out.println(evenNUmbers.containsAll(evenNumbers2));
        System.out.println(evenNUmbers.containsAll(evenNumbers2));

        System.out.println(evenNUmbers.hashCode());

        Set<String> Motorcycle = new HashSet<>();
        Motorcycle.add("Harley Davidson");
        Motorcycle.add("Honda");
        Motorcycle.add("Yamaha");
        Motorcycle.add("Kawasaki");
        Motorcycle.add("Suzuki");
        Motorcycle.add("BMW");
        Motorcycle.add("Ducati");
        Motorcycle.add("MV Agusta");

        List <String> Weekdays = new ArrayList<String>();
        Weekdays.add("Monday");
        Weekdays.add("Tuesday");
        Weekdays.add("Wednesday");
        Weekdays.add("Thursday");
        Weekdays.add("Friday");
        Weekdays.add("Saturday");
        Weekdays.add("Sunday");
        Weekdays.add("Monday");

        System.out.println(Weekdays);

        Set<String> weekdays2 = new HashSet<>();
        //weekdays2.addAll(Weekdays);

        for(String str: Weekdays){
            weekdays2.add(str);
        }

        System.out.println(weekdays2);
        Set <Integer> digitsH = new HashSet<Integer>();
        SortedSet <Integer> digitsT = new TreeSet<>();

        for(int i = 10; i <= 50; i+=5) {
            digitsH.add(i);
            digitsT.add(i);
        }


        for(int i = 10; i <= 50; i+=5) {
            digitsT.add(i);
        }
        System.out.println(digitsT);
        System.out.println(digitsH);

        // first ()

        System.out.println(digitsT.first());
        //last ()
        System.out.println(digitsT.last());

        TreeSet <String> wDays = new TreeSet<String>();
        wDays.addAll(Weekdays);

        System.out.println("Arr List: " + Weekdays);
        System.out.println("HasSet " + weekdays2);
        System.out.println(wDays);








    }


}
