package dateandtime;

import java.time.Clock;
import java.time.Duration;
import java.time.Instant;

public class Clocks {
    public static void main(String[] args) {
        Clock clock1 = Clock.systemDefaultZone();
        System.out.println(clock1);
        Instant instant1 = clock1.instant();
        System.out.println(instant1);

        Clock clock2 = Clock.systemUTC();
        System.out.println(clock2.instant());

        Clock clock3 = Clock.offset(clock1, Duration.ofHours(10));
        System.out.println(clock3.instant());
    }
}
