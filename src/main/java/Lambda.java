import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Lambda
 * @author Sup4eg
 */

public class Lambda {


    public static void main(String[] args) {
        List<String> names = Arrays.asList("peter", "anna", "mike", "xenia");
     /* old method
        Collections.sort(names, new Comparator<String>() {
            @Override
            public int compare(String a, String b) {
                return b.compareTo(a);
            }
        });
      */

        //new path
        Collections.sort(names, (a, b) -> b.compareTo(a));

    }

}
