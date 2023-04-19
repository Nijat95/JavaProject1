import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class LocalDateAndTime {

    public static void main(String[] args) {

        LocalDate date = LocalDate.now();
        System.out.println(date);

        LocalTime time = LocalTime.now();
        System.out.println(time);

       /* LocalDateTime dateTime = LocalDateTime.now();
        //System.out.println("Before formatting: " + dateTime);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("E, MMM/dd/yy  HH:mm:ss");

        String dateTimeFormat = formatter.format(dateTime);
        System.out.println(dateTimeFormat); */
        String LocalDateTime = returnTime();
        System.out.println(LocalDateTime);


    }

    public static String returnTime() {
        String time1;
        LocalDateTime dateTime = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("E, MMM/dd/yy  HH:mm:ss");
        time1 = formatter.format(dateTime);

        return time1;

    }
}
