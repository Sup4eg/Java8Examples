/**
 * Constructor references
 * @author Sup4eg
 */

public class Person {
    String firstName;
    String lastName;

    Person() {}

    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public static void main(String[] args) {
        PersonFactory<Person> personFactory = Person::new;
        Person person = personFactory.create("Peter", "Parker");
        System.out.println(person.getFirstName());
        System.out.println(person.getLastName());
    }

}

interface PersonFactory<P extends Person> {
    P create(String firstName, String lastName);
}
