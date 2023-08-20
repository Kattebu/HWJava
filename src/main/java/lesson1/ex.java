package lesson1;

import java.util.Scanner;

public class ex {

    public static void main(String[] args) {
        System.out.println("hello");
        // todo: abc
        Scanner scanner= new Scanner(System.in);
        int n = scanner.nextInt();
        int res = getRes(n);
        System.out.println("res=" + res);
    }

    /**
     * @apiNote https://leetcode.com/problems/subtract-the-product-and-sum-of-digits-of-an-integer/description/
     * @param n - входящее число
     * @return произведение разрядов минус сумма разрядов
     */

    private static int getRes(int n) {
        int pr=1;
        int sum = 0;
        while (n !=0){
            pr*= n % 10;
            sum += n % 10;
            n /=10;
        }
        int res = pr - sum;
        return res;
    }
}
