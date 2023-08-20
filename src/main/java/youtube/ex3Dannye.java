package youtube;

import java.util.Scanner;

public class ex3Dannye {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
//        System.out.println("введите имя ");
//        String username = scan.nextLine();
//        System.out.println("Привет " + username);
//        int num1 = scan.nextInt();
        System.out.println("введите число ");
        float num1 = scan.nextFloat();
        System.out.println("введите число2 ");
        float num2 = scan.nextFloat();
        float res1 = num1 + num2;
        float res2 = num1 - num2;
        float res3 = num1 * num2;
        float res4 = num1 / num2;
        System.out.println("result ");
        System.out.println(res1 + "\n" + res2 + "\n" +res3 + "\n" +res4);
    }
}
