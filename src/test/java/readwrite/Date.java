package readwrite;

/*import java.time.LocalDateTime;
import java.time.temporal.ChronoField;*/
import java.util.Calendar;

/**
 * Created by amarpreet911 on 11/10/17.
 */
public class Date {

    Calendar now = Calendar.getInstance();
    int year = now.get(Calendar.YEAR);
    int month = now.get(Calendar.MONTH) + 1; // Note: zero based!
    int day = now.get(Calendar.DAY_OF_MONTH);
    int hour = now.get(Calendar.HOUR_OF_DAY);
    int minute = now.get(Calendar.MINUTE);
    int second = now.get(Calendar.SECOND);
    int millis = now.get(Calendar.MILLISECOND);

    public static void main(String args[]){
        new Date();
    }

    public Date(){
        System.out.printf("%d-%02d-%02d %02d:%02d:%02d.%03d", year, month, day, hour, minute, second, millis);

    }
/*
    LocalDateTime now = LocalDateTime.now();
    int year = now.getYear();
    int month = now.getMonthValue();
    int day = now.getDayOfMonth();
    int hour = now.getHour();
    int minute = now.getMinute();
    int second = now.getSecond();
    int millis = now.get(ChronoField.MILLI_OF_SECOND); // Note: no direct getter available.

System.out.println("%d-%02d-%02d %02d:%02d:%02d.%03d", year, month, day, hour, minute, second, millis);
*/
}
