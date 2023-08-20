package HW6;

public class Laptop {
    private String brand;
    private String os;
    private String color;
    private int ram;
    private int hdd;
    private int price;


    public Laptop(String brand, String os, String color, int ram, int hdd, int price) {
        this.brand = brand;
        this.os = os;
        this.color = color;
        this.ram = ram;
        this.hdd = hdd;
        this.price = price;
    }

    public String getBrand() {
        return brand;
    }

    public String getOs() {
        return os;
    }

    public String getColor() {
        return color;
    }

    public int getRam() {
        return ram;
    }

    public int getHdd() {
        return hdd;
    }
    public int getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Laptop{" +
                "brand='" + brand + '\'' +
                ", os='" + os + '\'' +
                ", color='" + color + '\'' +
                ", ram=" + ram +
                ", hdd=" + hdd +
                ", price=" + price +
                '}';
    }
}
