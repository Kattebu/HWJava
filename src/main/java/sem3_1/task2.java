package sem3_1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class task2 {
    //Дан массив объектов: фамилия студента, номер группы, размер стипендии, баллы по 3 предметам.
    // Определить стипендии студентов, фамилии которых заканчиваются на «ова», при четной сумме баллов.
    public static void main(String[] args) {
        Student student = new Student("Ivanov", 1, 10000, List.of(3,5,4));
        Student student1 = new Student("Petrov", 1, 12000, List.of(2,5,4));
        Student student2 = new Student("Sidorova", 2, 15000, List.of(4,4,4));
        Student student3 = new Student("Egorova", 3, 8000, List.of(3,3,3));
        List<Student> studentList = new ArrayList<>(Arrays.asList(
                student, student1, student2, student3));
        for (Student stud: studentList) {
            if (stud.getName().endsWith("ova") && chet(stud.getBals())){
                System.out.println("stud.getSalary()= " + stud.getSalary());
            }
        }

    }

    private static boolean chet(List<Integer> bals) {
        int sum = 0;
        for (Integer bal : bals) {
            sum+=bal;
        }
        return sum%2 == 0;
    }
}
