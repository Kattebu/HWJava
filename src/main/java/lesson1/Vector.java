package lesson1;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class Vector {
    private double x;
    private double y;
    private double z;

    /**
     * @return длина вектора
     */
    public double length() {
        return Math.sqrt(x * x + y * y + z * z);
    }

    /**
     * @param vectorTwo переданный вектор
     * @returnк скалярное произведение
     */
    public double scalar(Vector vectorTwo) {
        return x * vectorTwo.x + y * vectorTwo.y + z * vectorTwo.z;
    }

    /**
     * @param vectorTwo переданный параметр
     * @return векторное произведение
     */
    public Vector proizv(Vector vectorTwo) {
        return new Vector(y * vectorTwo.z - z * vectorTwo.y,
                z * vectorTwo.x - x * vectorTwo.z,
                x * vectorTwo.y - y * vectorTwo.x);
    }

    /**
     * @param vectorTwo переданный вектор
     * @return угол между векторами
     */
    public double cos(Vector vectorTwo) {
        return (scalar(vectorTwo)) / (length() * vectorTwo.length());
    }
}
