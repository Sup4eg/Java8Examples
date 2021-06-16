import java.util.Optional;

/**
 * Describe optionals in java8
 * @author Sup4eg
 */

public class Optionals {

    public static void main(String[] args) {
        Optional<String> optional = Optional.of("bam");
        System.out.println(optional.isPresent());
        System.out.println(optional.get());
        System.out.println(optional.orElse("fallback"));

        optional.ifPresent(s -> System.out.println(s.charAt(0)));
    }
}
