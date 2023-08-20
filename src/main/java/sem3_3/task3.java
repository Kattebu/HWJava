package sem3_3;

import java.util.*;

public class task3 {
    //Даны следующие сведения о кубиках: размер каждого кубика (длина ребра в целых сантиметрах),
    // его цвет (красный, желтый, зеленый тд) и материал (деревянный, металлический, картонный и тд.). Найти:
    //
    //- количество кубиков желтого цвета и их суммарный объем;
    //
    //- количество деревянных кубиков с ребром 3 см
    public static void main(String[] args) {
        // Cube cube1 = new Cube(3, "красный", "деревянный");
        //Cube cube2 = new Cube(2, "желтый", "металлический");
        //Cube cube3 = new Cube(1, "зеленый", "деревянный");
        //Cube cube4 = new Cube(4, "желтый", "картонный");
        List<Cube> cubeList = new ArrayList<>(Arrays.asList(
                new Cube(3, "красный", "деревянный"),
                new Cube(3, "красный", "деревянный"),
                new Cube(3, "красный", "деревянный"),
                new Cube(2, "желтый", "металлический"),
                new Cube(1, "зеленый", "деревянный"),
                new Cube(4, "желтый", "картонный")
        ));
        int kYellow = 0;
        int sumVolume = 0;
        int kWood = 0;
        for (Cube cube : cubeList) {
            if(cube.getMaterial().equals("деревянный") && cube.getSize()==3) {
                kWood++;
            }
            if(cube.getColor().equals("желтый")){
                kYellow++;
                sumVolume+= cube.getVolume();
            }
        }
        System.out.println("kYellow= " + kYellow);
        System.out.println("sumVolume " + sumVolume);
        System.out.println("kWood " + kWood);
        System.out.println("unicumCollection(cubeList)" + unicumCollection(cubeList));
    }

    private static Collection unicumCollection(List<Cube> cubeList) {
        return new HashSet<>(cubeList);
    }
}
