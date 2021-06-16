package repeatableAnnotations;
/**
 * @author Sup4eg
 */

@Hint("hint1")
@Hint("hint2")
public class Person {
    public static void main(String[] args) {
        Hint hint = Person.class.getAnnotation(Hint.class);
        System.out.println(hint);
    }
}
