package lesson1;

import java.util.Scanner;

public class sem2_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int res = getSum(scanner, n);
        System.out.println(res);
    }

    /**
     * @apiNote Дана последовательность из N целых чисел.
     *  Найти сумму чисел, оканчивающихся на 5, перед которыми идет четное число
     * @param scanner первое число
     * @param n количество чисел
     * @return сумма чисел заканчив на 5 перед которыми ччетное
     */
    private static int getSum(Scanner scanner, int n) {
        int a = scanner.nextInt();
        int res = 0;
        for (int i = 1; i < n; i++) {
            int b = scanner.nextInt();
            if (a%2==0 && b%10==0) {
                res+=b;
            }
            a=b;
        }
        return res;
    }
}
