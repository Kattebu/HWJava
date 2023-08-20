package lesson1;

import java.util.Scanner;

public class ex3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        String result = changePartsOfString(str);
        System.out.println("result=" + result);
    }

    /**
     * @param str исходная строка
     * @return результат
     * @apiNote Дана строка. Поменять местами ее половины.
     */
    private static String changePartsOfString(String str) {
        String str2 = str.substring(str.length() / 2);
        String str1 = str.substring(0, str.length() / 2);
        String result = str2 + str1;
        return result;
    }
}
