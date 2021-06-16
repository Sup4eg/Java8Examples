/**
 * Functional interface
 */

@FunctionalInterface
public interface Converter<F, T> {
    T convert(F from);

    public static void main(String[] args) {

        //lambda
        Converter<String, Integer> converter1 = from -> Integer.valueOf(from);
        Integer converted1 = converter1.convert("123");
        System.out.println(converted1);

        //method
        Converter<String, Integer> converter2 = Integer::valueOf;
        Integer converted2 = converter2.convert("123");
        System.out.println(converted2);
    }

}
