package dateandtime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;

public class DateAndTimes {
    public static void main(String[] args) {

        //Dates
        LocalDate ld1 = LocalDate.now();
        LocalDate ld2 = LocalDate.of(2024, 3, 14);
        LocalDate ld3 = LocalDate.of(2024, Month.DECEMBER, 18);
        System.out.println(ld1);
        System.out.println(ld2);
        System.out.println(ld3);

        //invalid date
        /*LocalDate invalidDate = LocalDate.of(2023, Month.FEBRUARY, 29);
        System.out.println(invalidDate);*/

        //Times
        System.out.println();
        LocalTime lt1 = LocalTime.now();
        LocalTime lt2 = LocalTime.of(18, 12);
        LocalTime lt3 = LocalTime.of(18, 12, 12);
        LocalTime lt4 = LocalTime.of(18, 12, 12, 12);
        System.out.println(lt1);
        System.out.println(lt2);
        System.out.println(lt3);
        System.out.println(lt4);

        //DateTimes
        System.out.println();
        LocalDateTime ldt1 = LocalDateTime.now();
        LocalDateTime ldt2 = LocalDateTime.of(2024, 12, 18, 0, 0);
        LocalDateTime ldt3 = LocalDateTime.of(ld1, lt1);

        System.out.println(ldt1);
        System.out.println(ldt2);
        System.out.println(ldt3);
    }

}
