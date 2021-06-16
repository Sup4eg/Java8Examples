import java.time.LocalTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.time.temporal.ChronoUnit;
import java.util.Locale;

/**
 * Describes LocalTime java
 * @author Sup4eg
 */

public class LocalTimeJava {

    public static void main(String[] args) {
        ZoneId zone1 = ZoneId.of("Europe/Berlin");
        ZoneId zone2 = ZoneId.of("Brazil/East");

        LocalTime now1 = LocalTime.now(zone1);
        LocalTime now2 = LocalTime.now(zone2);
        System.out.println(now1.isBefore(now2));

        long hoursBetween = ChronoUnit.HOURS.between(now2, now1);
        long minutesBetween = ChronoUnit.MINUTES.between(now2, now1);

        System.out.println(hoursBetween);
        System.out.println(minutesBetween);
        System.out.println("-".repeat(20));

        LocalTime late = LocalTime.of(23, 59, 59);
        System.out.println(late);

        DateTimeFormatter germanFormatter = DateTimeFormatter.ofLocalizedTime(FormatStyle.SHORT)
                .withLocale(Locale.GERMAN);

        LocalTime leetTime = LocalTime.parse("13:37", germanFormatter);
        System.out.println(leetTime);
    }

}
