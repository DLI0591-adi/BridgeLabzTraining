package Day6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class two {
    public static void main(String[] args) {
        List<String> strings = new ArrayList<>(Arrays.asList("Apple", "Banana", "Litchi", "Orange", "Coconut"));
        strings.stream().filter(a->a.startsWith("A")).forEach(System.out::println);

    }
}