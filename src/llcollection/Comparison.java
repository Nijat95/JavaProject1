package llcollection;

import javax.sound.sampled.Line;
import java.util.LinkedList;

public class Comparison {
    public static void main(String[] args) {

        LinkedList<String> cities1 = new LinkedList<String>();
        cities1.add("Chicago");
        cities1.add("NYC");
        cities1.add("Rome");
        cities1.add("Kyev");
        cities1.add("Dubai");

        cities1.addFirst("Budapest");

        LinkedList<String> cities2 = new LinkedList<String>();
        cities2.add("Chicago");
        cities2.add("NYC");
        cities2.add("Paris");
        cities2.add("San Francisco");
        cities2.add("Dubai");
        cities2.add("Istanbul");

        LinkedList<String> result = new LinkedList<>();

        if(cities1.size() > cities2.size()) {
            for(String city : cities1) {
                result.add(String.valueOf(cities2.contains(city)));
            }

        }else{
            for(String city : cities2) {
                result.add(String.valueOf(cities1.contains(city)));
            }
        }
        System.out.println(result);



    }
}
