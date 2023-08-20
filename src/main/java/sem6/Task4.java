package sem6;

public class Task4 {
    public static void main(String[] args) {
        //Напишите интерфейс Converter для конвертации из градусов по Цельсию в
        //Кельвины, Фаренгейты. У классов наследников необходимо
        // переопределить метод интерфейса, для валидного
        // перевода величин. Метод для конвертации назовите "convertValue".
        double temp = 0;
        System.out.println("t Celc = " + new CelsConverter().convertValue(temp));
        System.out.println("t Kelv = " + new KelvConverter().convertValue(temp));
        System.out.println("t Foren = " + new ForenConverter().convertValue(temp));
    }
}
