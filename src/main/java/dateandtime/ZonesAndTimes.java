package dateandtime;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.TextStyle;
import java.util.Locale;

public class ZonesAndTimes {
    public static void main(String[] args) {
        for(String zoneId : ZoneId.getAvailableZoneIds()){
            /*System.out.println(zoneId);*/
            ZoneId zoneId1 = ZoneId.of(zoneId);
            String zoneIdDisplayName = zoneId1.getDisplayName(TextStyle.FULL, Locale.US);
            System.out.println(zoneId + " : "+ zoneIdDisplayName);
        }
        ZoneId zoneId = ZoneId.of("US/Pacific");
        LocalDateTime ldt1 = LocalDateTime.now();
        ZonedDateTime zdt1 = ZonedDateTime.of(ldt1, zoneId);
        ZonedDateTime zdt2 = ldt1.atZone(zoneId);
        ZonedDateTime zdt3 = ZonedDateTime.now();
        System.out.println(zdt1);
        System.out.println(zdt2);
        System.out.println(zdt3);
        System.out.println(zdt3.getZone());

    }

}
