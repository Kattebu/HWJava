package lesson1.HW5;

import java.util.*;

public class Ex2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите список имен с фамилиями через пробел:");
        String input = scanner.nextLine();

        String[] names = input.split(" ");
        Map<String, Integer> nameCount = getNameCount(names);

        List<Map.Entry<String, Integer>> sortedList = new ArrayList<>(nameCount.entrySet());
        sortedList.sort(Map.Entry.comparingByValue(Comparator.reverseOrder()));

        for (Map.Entry<String, Integer> entry : sortedList) {
            if (entry.getValue() > 1) {
                System.out.println(entry.getKey() + " - " + entry.getValue() + " раз(а)");
            }
        }
    }

    /**
     * @apiNote Написать программу, которая найдёт и выведет повторяющиеся имена
     *   с количеством повторений. Отсортировать по убыванию популярности.
     * @param names
     * @return количеством повторений
     */
    private static Map<String, Integer> getNameCount(String[] names) {
        Map<String, Integer> nameCount = new HashMap<>();

        for (String name : names) {
            if (nameCount.containsKey(name)) {
                nameCount.put(name, nameCount.get(name) + 1);
            } else {
                nameCount.put(name, 1);
            }
        }
        return nameCount;
    }
}
