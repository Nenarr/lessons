package lesson13;

import java.util.*;

public class Task1 {
    public static void main(String[] args){
        ArrayList<String> words = new ArrayList<>(Arrays.asList(
                "яблоко", "груша", "банан", "яблоко", "апельсин",
                "груша", "груша", "слива", "банан", "яблоко"
        ));

        HashMap<String, Integer> wordCount = new HashMap<>();
        for (String word : words) {
            wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
        }

        System.out.println("Уникальные слова и их количество:");
        for (Map.Entry<String, Integer> entry : wordCount.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
