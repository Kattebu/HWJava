package lesson1.HW5;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите предложение:");
        String sentence = scanner.nextLine();
        String[] words = sentence.split(" ");
        Map<String, Integer> wordCount = getWordCount(words);
        System.out.println("Количество вхождений каждого слова:");
        for (Map.Entry<String, Integer> entry : wordCount.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }

    /**
     * @param words
     * @return Количество вхождений каждого слова
     * @apiNote Подсчитать количество вхождения каждого слова
     */
    private static Map<String, Integer> getWordCount(String[] words) {
        Map<String, Integer> wordCount = new HashMap<>();
        for (String word : words) {
            if (wordCount.containsKey(word)) {
                wordCount.put(word, wordCount.get(word) + 1);
            } else {
                wordCount.put(word, 1);
            }
        }
        return wordCount;
    }
}
