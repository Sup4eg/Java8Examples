import java.util.function.Function;

/**
 * Describes functions in java8
 * @author Sup4eg
 */

public class Functions {

    public static void main(String[] args) {
        Function<String, Integer> toInteger = Integer::valueOf;
        Function<String, String> backToString = toInteger.andThen(String::valueOf);

        backToString.apply("123");

    }


}
