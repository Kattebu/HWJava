package sem4;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class task4 {
    public static void main(String[] args) {
        //Построить однонаправленный список целых чисел.
        // Удалить отрицательные элементы списка.
        List<Integer> numbers = new LinkedList<>(Arrays.asList(2, 3, -6, -7, -9, -2, 5));
        removedElement(numbers);
        System.out.println("numbers = " + numbers);
    }

    /**
     * @apiNote //Построить однонаправленный список целых чисел.
     *         // Удалить отрицательные элементы списка.
     * @param numbers
     */
    private static void removedElement(List<Integer> numbers) {
        for (int i = 0; i < numbers.size(); i++) {
            if (numbers.get(i)<0){
                //numbers.remove(numbers.get(i));
                //numbers.remove(numbers.indexOf(numbers.get(i)));
                numbers.remove(i);
                i--;
            }
        }
    }
}
