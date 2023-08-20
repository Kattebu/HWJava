package sem6;

import java.util.*;

public class Task3 {
    public static void main(String[] args) {
        //Найти пересечения слов в массивах и указать их общее количество.
        //Пример:
        //Mas1= [“qwe”,”asd”,”qwe”,”x”]
        //Mas2=[“qwe”,”v”]
        //Результат:
        //qwe=
        List<String> arr1 = new ArrayList<>(Arrays.asList("qwe","asd","qwe","x"));
        List<String> arr2 = new ArrayList<>(Arrays.asList("qwe","v"));
        Set<String> setResult = getPeresech(arr1, arr2);
        System.out.println("setResult = " + setResult);
        resultSout(arr1, arr2, setResult);
    }

    /**
     * @apiNote Найти пересечения слов в массивах и указать их общее количество.
     * @param arr1
     * @param arr2
     * @return
     */
    private static Set<String> getPeresech(List<String> arr1, List<String> arr2) {
        Set<String> set1 = new HashSet<>(arr1);
        Set<String> set2 = new HashSet<>(arr2);
        Set<String> setResult = new HashSet<>(arr1);

        setResult.retainAll(set2);
        return setResult;
    }

    /**
     * @apiNote Найти пересечения слов в массивах и указать их общее количество.
     * @param arr1
     * @param arr2
     * @param setResult
     */
    private static void resultSout(List<String> arr1, List<String> arr2, Set<String> setResult) {
        for (String s : setResult) {
            int k = 0;
            for (String elem : arr1) {
                if(setResult.contains(elem)){
                    k++;
                }
            }
            for (String elem : arr2) {
                if(setResult.contains(elem)){
                    k++;
                }
            }
            System.out.printf("кол-во: %s = %d \n",s, k);
        }
    }
}
