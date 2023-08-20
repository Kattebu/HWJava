package sem5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Task2 {
    public static void main(String[] args) {
        //Определить, есть ли в массиве дубликаты, если найден хоть один, вывести на экран (true),
        //
        //В противном случае (false).
        ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 3, 2));
        Map<Integer, Integer> dub = addElementToMap(arr);
        boolean check = isCheck(dub);
        System.out.println("check = " + check);
    }

    /**
     * @param dub
     * @return
     * @apiNote Определить, есть ли в массиве дубликаты, если найден хоть один, вывести на экран (true),
     * В противном случае (false).
     */
    private static boolean isCheck(Map<Integer, Integer> dub) {
        for (Map.Entry<Integer, Integer> element : dub.entrySet()) {
            if (element.getValue() > 1) {
                return true;
            }
        }
        return false;
    }

    private static Map<Integer, Integer> addElementToMap(ArrayList<Integer> arr) {
        Map<Integer, Integer> dub = new HashMap<>();
        for (int i = 0; i < arr.size(); i++) {
            if (dub.containsKey(arr.get(i))) {
                dub.put(arr.get(i), dub.get(arr.get(i)) + 1);
            } else {
                dub.put(arr.get(i), 1);
            }
        }
        return dub;
    }
}
