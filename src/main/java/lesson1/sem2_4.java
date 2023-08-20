package lesson1;

public class sem2_4 {
    public static void main(String[] args) {
        Vector vector = new Vector(1, 2, 3);
        Vector vectorTwo = new Vector(1, 1, 1);
        System.out.println("vector " + vector);
        System.out.println("vectorTwo " + vectorTwo);
        System.out.println("vector.length " + vector.length());
        System.out.println("vector.scalar " + vector.scalar(vectorTwo));
        System.out.println("vector.proizv(vectorTwo) " + vector.proizv(vectorTwo)); // todo переименовать метод
        System.out.println("vector.cos(vectorTwo) " + vector.cos(vectorTwo));
    }
}
