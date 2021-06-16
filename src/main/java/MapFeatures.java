import java.util.HashMap;
import java.util.Map;

/**
 * Map's features in java8
 * @author Sup4eg
 */

public class MapFeatures {

    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();

        for (int i = 0; i < 10; i++) {
            map.putIfAbsent(i, "val" + i);
        }
        map.forEach((id, val) -> System.out.println(val));
        System.out.println("-".repeat(20));

        map.computeIfPresent(3, (num, val) -> val + num);
        System.out.println(map.get(3));

        map.computeIfPresent(9, (num, val) -> null);
        System.out.println(map.containsKey(9));

        map.computeIfAbsent(23, num -> "val" + num);
        System.out.println(map.containsKey(23));
        System.out.println(map.get(23));

        map.computeIfAbsent(3, num -> "bam");
        System.out.println(map.get(3));
        System.out.println("-".repeat(20));

        map.remove(3, "val3");
        System.out.println(map.get(3));

        map.remove(3, "val33");
        System.out.println(map.get(3));

        map.getOrDefault(42, "not found");

        System.out.println("-".repeat(20));
        map.merge(9, "val9", (value, newValue) -> value.concat(newValue));
        System.out.println(map.get(9));

        map.merge(9, "concat", (value, newValue) -> value.concat(newValue));
        System.out.println(map.get(9));
    }

}
