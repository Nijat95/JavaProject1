package CollectionFrameWorks;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapClass {

    public static void main(String[] args) {

        // key : value
        // USA: DC
        // UK: London

        // key : value
        // 1 : 100
        // 2 : 200

        Map<String, String> country_name = new HashMap<>();
        country_name.put("USA", "DC");
        country_name.put("UK", "London");
        country_name.put("Brazil", "Brazilia");
        country_name.put("Canada", "Ottawa");

        System.out.println(country_name);

        Map<Integer, String> month = new TreeMap<>();

        month.put(8,"August");
        month.put(9,"September");
        month.put(10,"October");
        month.put(11,"November");
        month.put(12,"December");
        month.put(1, "January");
        month.put(2, "February");
        month.put(3,"March");
        month.put(4,"April");
        month.put(5,"May");
        month.put(6,"June");
        month.put(7,"July");


        Map<Integer, String> month2 = new HashMap<Integer, String>();
        month2.putAll(month);
        System.out.println(month);
        System.out.println(month2);

    }
}
