package sem4;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class task2 {

    public static void main(String[] args) {
        List<Integer> numbers = new LinkedList<>(Arrays.asList(1,2,3,4,5,6,7));
        System.out.println("sum = " + getSum(numbers));
    }

    /**
     * @apiNote     Построить однонаправленный
     *     список целых чисел. Найти сумму четных элементов списка.
     * @param numbers
     * @return сумму четных чисел
     */
    private static int getSum(List<Integer> numbers) {
        int sum = 0;
        for (int i = 0; i < numbers.size(); i++) {
            if (numbers.get(i)%2 ==0) {
                sum+= numbers.get(i);
            }
        }
        return sum;
    }
}
