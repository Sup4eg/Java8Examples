import java.util.function.Predicate;

/**
 * Describe predicate class in java8
 * @author Sup4eg
 */

public class Predicates {

    public static void main(String[] args) {

        Predicate<String> predicate = (s) -> s.length() > 0;
        System.out.println(predicate.test("foo"));
        System.out.println(predicate.negate().test("foo"));

        Predicate<String> isEmpty = String::isEmpty;
        Predicate<String> isNotEmpty = isEmpty.negate();

        System.out.println();

        System.out.println(isEmpty.test(""));
        System.out.println(isNotEmpty.test(""));

    }




}
