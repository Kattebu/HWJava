//package youtube;
//
//import java.io.File;
//import java.util.Scanner;
//
//public class hw1 {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Введите уравнение: ");
//        String equation = scanner.nextLine();
//        String[] parts = equation.split("\s*[+=]\s*");
//        int q = -1, w = -1, e = -1;
//        for (int i = 0; i < 10; i++) {
//            if (q==-1 && !parts[0].contains("?")) {
//                q = Integer.parseInt(parts[0]);
//            }
//            if (w==-1 && !parts[1].contains("?")) {
//                w=Integer.parseInt(parts[1]);
//            }
//            if (e==-1 && !parts[2].contains("?")) {
//                e = Integer.parseInt(parts[2]);
//            }
//            if (parts[0].charAt(i) == '?'){
//                q=i;
//            }
//            if (parts[1].charAt(i) == '?'){
//                w=i;
//            }
//            if (parts[2].charAt(i) == '?'){
//                e=i;
//            }
//            if (q+w==e && q!= -1 && w!=-1 && e!=-1) {
//                System.out.printf("%d + %d = %d", q, w, e);
//            } else {
//                System.out.println("Решений нет");
//            }
//        }
//    }
//    import java.io.File;
//import java.util.Scanner;
//
//    public class Equation {
//        public static void main(String[] args) {
//            try (Scanner scanner = new Scanner(new File("equation.txt"))) {
//                String equation = scanner.nextLine();
//                int[] digits = new int[3];
//                for (int i = 0; i < equation.length(); i++) {
//                    if (equation.charAt(i) == '?') {
//                        digits[i % 3] = Integer.parseInt(equation.substring(i, i + 1));
//                    } else {
//                        if (i % 2 == 0) {
//                            digits[0] += 1;
//                        } else if (i % 2 != 0 && digits[0] == 0) {
//                            digits[1] += 1;
//                        }
//                    }
//                }
//
//                if (digits[0] > digits[1]) {
//                    digits[0], digits[2] = digits[2], digits[0];
//                }
//                System.out.println("Given the equation:" + equation);
//                System.out.println("Result:" + getSolution(digits));
//            } catch (Exception e) {
//                e.printStackTrace();
//            }
//        }
//
//        private static String getSolution(int[] digits) {
//            StringBuilder sb = new StringBuilder();
//            sb.append(digits[0]);
//            sb.append(" + ");
//            sb.append((digits[1]+1) * (digits[2]+1));
//            sb.append(" = ");
//            for (int d : digits) {
//                sb.append(d);
//            }
//            return sb.
//}
