package sem6;

import java.util.*;

public class Task1 {
    public static void main(String[] args) {
        //Дан массив чисел, посчитать процент уникальных чисел.
        //
        //*процент уникальных чисел = количество уникальных чисел * 100 / общее количество чисел в массиве.
        List<Integer> array = new ArrayList<>(Arrays.asList(1, 2, 2, 4));
        int result = getUnicumPercent(array);
        System.out.println("result = " + result);
    }

    /**
     * @param array input
     * @return result
     * @apiNote Дан массив чисел, посчитать процент уникальных чисел.
     */
    private static int getUnicumPercent(List<Integer> array) {
        Set<Integer> set = new HashSet<>();
        for (Integer elem : array) {
            set.add(elem);
        }
        System.out.println("array = " + array);
        System.out.println("set = " + set);
        int result = set.size() * 100 / array.size();
        return result;
    }
}
