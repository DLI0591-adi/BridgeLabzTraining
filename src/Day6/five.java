package Day6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class five {
    public static void main(String[] args) {
        List<String> strings = new ArrayList<>(Arrays.asList("Shristi", "Subham", "Jyoti", "Saubhagya", "Kriti", "Suman"));
        Predicate<String> p1 = s -> s.length()>5;
        Predicate<String> p2 = s -> s.contains("h");

        Predicate<String> combine = p1.and(p2);

        strings.stream().filter(combine).forEach(System.out::println);

    }
}
