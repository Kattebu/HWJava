package lesson1;

import java.util.Scanner;

public class ex2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.print("k=" + getK(scanner, n));
        scanner.close();
    }

    /**
     * @param scanner вспомогательный параметр
     * @param n       количесвто чисел в последовательности
     * @return результат
     * @apiNote Дана последовательность чисел. Найти колчество положител чисел,
     * после которых стоит отрицательное
     */
    private static int getK(Scanner scanner, int n) {
        int k = 0;
        int a = scanner.nextInt();
        for (int i = 0; i < n - 1; i++) {
            int b = scanner.nextInt();
            if (a >= 0 && b < 0) {
                k++;
            }
            a = b;
        }
        return k;
    }
}
