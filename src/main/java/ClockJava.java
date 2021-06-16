import java.time.Clock;
import java.time.Instant;
import java.util.Date;

/**
 * Describes Clock api in java8
 * @author Sup4eg
 */

public class ClockJava {

    public static void main(String[] args) {
        Clock clock = Clock.systemDefaultZone();
        long millis = clock.millis();
        System.out.println(millis);

        Instant instant = clock.instant();
        Date legacyDate = Date.from(instant);
        System.out.println(legacyDate);
    }

}
