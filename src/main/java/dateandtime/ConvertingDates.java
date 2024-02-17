package dateandtime;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Calendar;
import java.util.Date;

public class ConvertingDates {
    public static void main(String[] args) {
        Date date = new Date(124, 1, 1);
        LocalDateTime ldt1 = date.toInstant().atZone(ZoneId.systemDefault()).toLocalDateTime();
        System.out.println(ldt1);

        Calendar calendar = Calendar.getInstance();
        LocalDateTime ldt2 = calendar.toInstant().atZone(ZoneId.systemDefault()).toLocalDateTime();
        System.out.println(ldt2);
    }
}
