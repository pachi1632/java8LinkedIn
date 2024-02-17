package dateandtime;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class FormattingDates {
    public static void main(String[] args) {
        LocalDateTime ldt1 = LocalDateTime.now();
        String isoFormattedDate = DateTimeFormatter.ISO_DATE_TIME.format(ldt1);
        String basicIsoDate = DateTimeFormatter.BASIC_ISO_DATE.format(ldt1);
        System.out.println(isoFormattedDate);
        System.out.println(basicIsoDate);

        LocalDateTime ldt2 = LocalDateTime.now();
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd-MM-YYYY");
        String formatStyleEnumDt = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM).format(ldt2);
        System.out.println(dtf.format(ldt2));
        System.out.println(formatStyleEnumDt);
    }
}
