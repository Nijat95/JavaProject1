package CollectionFrameWorks;

import java.util.ArrayList;
import java.util.List;

public class ArrayListClass4 {
    public static void main(String[] args) {
        String [] months = new String[12];

        months[0] = "Jan";
        months[1] = "Feb";
        months[2] = "Mar";
        months[3] = "Apr";
        months[4] = "May";
        months[5] = "Jun";
        months[6] = "Jul";
        months[7] = "Aug";
        months[8] = "Sep";
        months[9] = "Oct";
        months[10] = "Nov";
        months[11] = "Dec";

        ArrayList<String> arrayListMonth = new ArrayList<>();
        arrayListMonth.addAll(List.of(months[0]));
        arrayListMonth.add(months[1]);
        arrayListMonth.add(months[2]);
        arrayListMonth.add(months[3]);
        arrayListMonth.add(months[4]);
        arrayListMonth.add(months[5]);
        arrayListMonth.add(months[6]);
        arrayListMonth.add(months[7]);
        arrayListMonth.add(months[8]);
        arrayListMonth.add(months[9]);
        arrayListMonth.add(months[10]);
        arrayListMonth.add(months[11]);

        String test = arrayListMonth.toString().toUpperCase();
        //System.
        System.out.println(test.charAt(1));

        int n1 = 10;
        Integer n2 = 10;

        System.out.println(n1 + n2);

        long n3 = 1232113113;
        String newString = Long.toString(n3);
        Long.toString(n3);
        System.out.println(newString.length());

        n3 = Long.parseLong(newString);
        System.out.println(n3+1);
        System.out.println(arrayListMonth);
    }

}
