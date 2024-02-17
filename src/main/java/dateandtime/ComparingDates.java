package dateandtime;

import java.time.LocalDateTime;

public class ComparingDates {
    public static void main(String[] args) {
        LocalDateTime ldt1 = LocalDateTime.now();
        LocalDateTime ldt2 = LocalDateTime.of(2024, 12, 20, 0, 0);

        System.out.println(ldt1.compareTo(ldt2));
        System.out.println("is After: "+ldt1.isAfter(ldt2));
        System.out.println("is Before: "+ldt1.isBefore(ldt2));
        System.out.println("is Equal: "+ldt1.isEqual(ldt2));
    }
}
