import java.time.ZoneId;

/**
 * Describes timeZones in java8
 * @author Sup4eg
 */

public class Timezones {

    public static void main(String[] args) {
        System.out.println(ZoneId.getAvailableZoneIds());

        ZoneId zone1 = ZoneId.of("Europe/Berlin");
        ZoneId zone2 = ZoneId.of("Brazil/East");
        System.out.println(zone1.getRules());
        System.out.println(zone2.getRules());
    }

}
