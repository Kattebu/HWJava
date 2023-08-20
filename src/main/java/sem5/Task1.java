package sem5;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Посчитать количество вхождений каждого символа в текст.
        System.out.println("введите текст для извлечения символов");
        String text = scanner.nextLine();
        Map<Character, Integer> mapCh = getCharMapFromText(text);
        for (Map.Entry<Character, Integer> elem : mapCh.entrySet()) {
            System.out.println("количество " + elem.getKey() + "элемента " + elem.getValue());
        }
        System.out.println(mapCh); //mapCh.entrySet().iter
    }

    /**
     * @param text
     * @return
     * @apiNote Посчитать количество вхождений каждого символа в текст.
     */
    private static Map<Character, Integer> getCharMapFromText(String text) {
        Map<Character, Integer> mapCh = new HashMap<>();
        for (int i = 0; i < text.length(); i++) {
            if (!mapCh.containsKey(text.charAt(i))) {
                mapCh.put(text.charAt(i), 1);
            } else {
                mapCh.put(text.charAt(i), mapCh.get(text.charAt(i)) + 1);
            }
        }
        return mapCh;
    }
}
//mapCh.putIfAbsent(text.charAt(1),0)
//mapCh.put(text.charAt(i),mapCh.get(text.charAt(i)) + 1);
