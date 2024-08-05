package Day6;

import java.util.*;
import java.util.stream.Collectors;

public class TextCorpus{

    public static void main(String[] args) {

        String text = "Paris, the capital of France, is renowned for its rich history, art, " +
                "and culture. Known as the \"City of Light,\" it boasts iconic landmarks such as " +
                "the Eiffel Tower, Notre-Dame Cathedral, and the Louvre Museum. Paris is a global " +
                "center for fashion, gastronomy, and the arts, attracting millions of tourists annually. " +
                "The city's charming streets, cafes, and Seine River add to its romantic allure. " +
                "Paris has also been a hub for intellectual and artistic movements, making " +
                "it a significant cultural and historical epicenter. Its blend of modernity" +
                " and tradition continues to captivate visitors worldwide.";

        Map<String, Long> wordCounts = Arrays.stream(text.toLowerCase().replaceAll("[^a-zA-Z ]", "").split("\\s+"))
                .collect(Collectors.groupingBy(word -> word, Collectors.counting()));

        List<Map.Entry<String, Long>> sortedWords = wordCounts.entrySet().stream()
                .sorted(Map.Entry.<String, Long>comparingByValue().reversed())
                .collect(Collectors.toList());

        if (sortedWords.size() > 1) {
            System.out.println("Second most frequent word: " + sortedWords.get(1).getKey() +
                    " \nwith frequency: " + sortedWords.get(1).getValue());
        } else {
            System.out.println("Not enough words to determine the second most frequent word.");
        }
    }
}