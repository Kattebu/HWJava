package sem5;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class HW {
    public static void main(String[] args) {
        // Подсчитать количество вхождения каждого слова
        //Пример:
        //Россия идет вперед всей планеты. Планета — это не Россия.
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите предложение:");
        String sentence = scanner.nextLine();
        String[] words = sentence.split(" ");
        Map<String, Integer> wordCount = new HashMap<>();
        for (String word : words) {
            if (wordCount.containsKey(word)) {
                wordCount.put(word, wordCount.get(word) + 1);
            } else {
                wordCount.put(word, 1);
            }
        }
        System.out.println("Количество вхождений каждого слова:");
        for (Map.Entry<String, Integer> entry : wordCount.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
