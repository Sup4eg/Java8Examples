import java.util.function.Supplier;

/**
 * Describes Suppliers in java8. Suppliers produce a result of a given generic type. Suppliers don't accept arguments
 * @author Sup4eg
 */

public class Suppliers {

    public static void main(String[] args) {
        Supplier<Person> personSupplier = Person::new;
        System.out.println(personSupplier.get().getClass());
    }

}
