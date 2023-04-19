package llcollection;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Converter {

    public static void main(String[] args) {
        // converting linked list to array list

        LinkedList<String> artists = new LinkedList<String>();
        artists.add("Picaso");
        artists.add("Matisse");
        artists.add("Da Vinci");
        artists.add("Van Gogh");

        List<String> converted = new ArrayList<>(artists);
        System.out.println(converted);
        artists.removeFirst();
        System.out.println(artists);
        artists.removeLast();
        System.out.println(artists);

        /*ArrayList<String> Colors = new ArrayList<>();
        Colors.add("Red");
        Colors.add("White");
        Colors.add("Yellow");
        Colors.add("Blue");

        List<String> convertedColors = new LinkedList<>(Colors);
        System.out.println(convertedColors);*/


    }

}
