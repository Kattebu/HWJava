package youtube;


import java.util.Scanner;

public class ex4uslovnye {
    public static void main(String[] args) {
        // условные операторы
        Scanner scanner = new Scanner(System.in);

        System.out.println("your number ");
        int num1 = scanner.nextInt();

        System.out.println("second number ");
        int num2 = scanner.nextInt();
        System.out.println("action ");
        String action =scanner.nextLine();
        action = scanner.nextLine();
        int res;
        switch (action) {
            case "+":
                res = num1 + num2;
                System.out.println("result " + res);
                break;
            case "-":
                res = num1 - num2;
                System.out.println("result " + res);
                break;
            case "*":
                res = num1 * num2;
                System.out.println("result " + res);
                break;
            case "/":
                if (num2 == 0) {
                    System.out.println(("error"));
                } else {
                    res = num1 / num2;
                    System.out.println("result " + res);
                }
                break;
            default:
                System.out.println("smth wrong");
        }
    }
}
