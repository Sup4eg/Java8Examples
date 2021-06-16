import java.util.function.Consumer;

/**
 * Describes consumers in java8
 * @author Sup4eg
 */

public class Consumers {

    public static void main(String[] args) {
        Consumer<Person> greeter = (p) -> System.out.println("Hello, " + p.firstName);
        greeter.accept(new Person("Luke", "Skywalker"));
    }

}
