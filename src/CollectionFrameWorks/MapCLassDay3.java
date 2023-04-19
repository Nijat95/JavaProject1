package CollectionFrameWorks;
import java.util.*;
public class MapCLassDay3 {

    public static void main(String[] args) {

        Map<Integer, String > seasons = new HashMap<Integer, String>();
        seasons.put(1,"Spring");
        seasons.put(2,"Summer");
        seasons.put(3,"Autumn");
        seasons.put(4,"Winter");

        Map <Integer, String> newSeasons = new HashMap<Integer, String>();
        newSeasons.putAll(seasons);

        newSeasons.remove(4);
        System.out.println(seasons);
        System.out.println(newSeasons);

        //seasons.putIfAbsent(5, "NewSpring");
        System.out.println(seasons.get(3));
        System.out.println(seasons.getOrDefault(4,"Winter"));

        System.out.println(seasons.containsKey(2));
        System.out.println(seasons.containsValue("Win"));

        System.out.println("Before => " + seasons);
        seasons.replace(1,"NewSpring");
        seasons.remove(4);
        System.out.println("After => " + seasons);

        System.out.println(seasons.keySet());
        System.out.println(seasons.values());
        System.out.println(seasons.entrySet());

        //System.out.println(seasons.compute(3, ));

        Map <Integer, String> mergeMap = new HashMap<Integer, String>();

    }
}
