package Day6;

import java.util.*;
        import java.util.stream.Collectors;

public class SecondMostRepeatedWord {
    public static void main(String[] args) {
        String text = "apple banana apple orange banana apple orange orange";
        String[] words = text.split("\\s+");
        Map<String, Long> wordCount = Arrays.stream(words)
                .collect(Collectors.groupingBy(word -> word, Collectors.counting()));

        List<Map.Entry<String, Long>> sortedWords = wordCount.entrySet().stream()
                .sorted(Map.Entry.<String, Long>comparingByValue().reversed())
                .collect(Collectors.toList());

        // Get the second most repeated word
        if (sortedWords.size() > 1) {
            String secondMostRepeatedWord = sortedWords.get(1).getKey();
            System.out.println("The second most repeated word is: " + secondMostRepeatedWord);
        } else {
            System.out.println("There is no second most repeated word.");
        }
    }
}

