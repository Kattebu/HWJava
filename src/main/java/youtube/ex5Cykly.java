package youtube;

public class ex5Cykly {
    public static void main(String[] args) {
        //циклы
//        for (int i = 100; i > 10; i--) {
//            System.out.println("element " + i);
//        }
//
//        int i = 0;
//        do {
//            System.out.println(i);
//            i++;
//        } while (i<10);
        for (int i = 0; i < 25; i++) {
            if (i % 3 ==0)
                continue;
            if (i>=17)
                break;
            System.out.println(i);
        }
    }
}
