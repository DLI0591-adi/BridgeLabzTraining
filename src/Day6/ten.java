package Day6;

import java.util.List;
import java.util.Optional;

public class ten {
    public static void main(String[] args) {

        List<Integer>list = List.of(12,13,14,15);

        Optional<Integer> num = findMax(list);

        num.ifPresentOrElse(
                a -> System.out.println("Max : "+a),
                () -> System.out.println("List is empty ")
        );
    }

    private static Optional<Integer> findMax(List<Integer> list) {
        return list.stream().max(Integer::compare);
    }
}