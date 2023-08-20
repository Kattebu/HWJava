package lesson1;

import java.util.Scanner;

public class sem2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double x = scanner.nextDouble();
        int n = scanner.nextInt();
        scanner.close();

        double res = getPower(x, n);
        System.out.println("result " + res);
    }

    /**
     * apiNote Реализуйте pow(x, n), который вычисляет значение x, возведенное в степень xn).
     * @param x чило,возводимое в степень
     * @param n степень числа
     * @return результат возведения числа в степень
     */
    private static double getPower(double x, int n) {
        if (n <0) {
            x =1/ x;
            n *=-1;
        }
        if (n==0)
            return 1;
        double res = x;
        for (int i = 1; i < n; i++) {
            res *= x;
        }
        return res;
    }
}
