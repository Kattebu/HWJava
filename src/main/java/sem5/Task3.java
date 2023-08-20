package sem5;

import java.util.HashMap;
import java.util.Map;

public class Task3 {
    public static void main(String[] args) {
        //Написать перевод из Римских цифр в арабские:
        //
        //I 1
        //
        //V 5
        //
        //X 10
        //
        //L 50
        //
        //C 100
        //
        //D 500
        //
        //M 1000
        //
        //Примеры:
        //
        //1) ввод: s = "LVIII"
        //
        //вывод: 58
        //
        //разбор: L = 50, V= 5, III = 3.
        //
        //2) ввод: s = "MCMXCIV"
        //
        //вывод: 1994
        //
        //разбор: M = 1000, CM = 900, XC = 90 and IV = 4.
        Map<Character, Integer> dict = new HashMap<>();
        dict.put('I',1);
        dict.put('V',5);
        dict.put('X',10);
        dict.put('L',50);
        dict.put('C',100);
        dict.put('D',500);
        dict.put('M',1000);
        String input = "LVIII";
        int res = 0;
        for (int i = 0; i < input.length()-1; i++) {
            if (dict.get(input.charAt(i))>=dict.get(input.charAt(i+1))){
                res+=dict.get(input.charAt(i));
            } else{
                res-=dict.get(input.charAt(i));
            }
        }
        res += dict.get(input.charAt(input.length()-1));
        System.out.println("res = " + res);
    }
}
