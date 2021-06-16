import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/**
 * Describes ParallelStreams in java8
 * @author Sup4eg
 */

public class ParallelStreams {

    public static void main(String[] args) {
        int max = 10_000_000;
        List<String> values = new ArrayList<>(max);
        for (int i = 0; i < max; i++) {
            UUID uuid = UUID.randomUUID();
            values.add(uuid.toString());
        }

        //sequential sort
        long t0 = System.nanoTime();

        long count = values.stream().sorted().count();
        System.out.println(count);

        long t1 = System.nanoTime();

        long nano = (t1 - t0);
        System.out.println(String.format("sequential sort took: %d ns", nano));

        //parallel sort
        long t0P = System.nanoTime();

        long countP = values.parallelStream().sorted().count();
        System.out.println(countP);

        long t1P = System.nanoTime();

        long nanoP = (t1P - t0P);
        System.out.println(String.format("parallel sort took: %d ns", nanoP));
    }


}
