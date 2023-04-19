package CollectionFrameWorks;

import java.util.ArrayList;
import java.util.List;

public class ArrayListClass3 {
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
        arrayListMonth.addAll(List.of(months));
    }

}
