package Day6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class six {
    public static void main(String[] args) {

        List<String> strings = new ArrayList<>(Arrays.asList("Shristi", "Subham", "Jyoti", "Saubhagya", "Kriti", "Suman"));

        Consumer<String> consumer = s -> System.out.println(s.toUpperCase());

        strings.forEach(consumer);
    }
}