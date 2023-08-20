package sem4;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class task3 {
    public static void main(String[] args) {
        //Заменить некратные 3 элементы списка, суммой нечетных элементов.
        List<Integer> numbers = new LinkedList<>(Arrays.asList(2, 3, 6, 7, 9, 2, 5));
        int sum = getSum(numbers);
        replaceElement(numbers, sum);
        System.out.println("numbers = " + numbers);
    }

    /**
     * @apiNote Заменить некратные 3 элементы списка, суммой нечетных элементов.
     * @param numbers
     * @param sum
     */
    private static void replaceElement(List<Integer> numbers, int sum) {
        for (int i = 0; i < numbers.size(); i++) {
            if (numbers.get(i) % 3 != 0) {
                numbers.set(i, sum);
            }
        }
    }

    private static int getSum(List<Integer> numbers) {
        int sum = 0;
        for (int i = 0; i < numbers.size(); i++) {
            if (numbers.get(i) % 2 != 0) {
                sum += numbers.get(i);
            }
        }
        return sum;
    }
}
