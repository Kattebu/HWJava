package sem6;

public class ForenConverter implements Converter {

    @Override
    public double convertValue(double baseTemp) {
        return 1.8*baseTemp + 32;
    }
}
