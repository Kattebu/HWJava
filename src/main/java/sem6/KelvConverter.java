package sem6;

public class KelvConverter implements Converter {
    @Override
    public double convertValue(double baseTemp) {
        return baseTemp + 273.1;
    }
}
