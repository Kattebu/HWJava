package sem6;

import java.util.*;
public class Try {
    public static void main(String[] args) {
        List<Laptop> laptops = new ArrayList<>();
        laptops.add(new Laptop("Apple", "Mac", "black", 8, 500, 10000));
        laptops.add(new Laptop("Huawei", "Windows11", "silver", 16, 1000, 3300));
        laptops.add(new Laptop("Lenovo", "Windows7", "red", 4, 256, 3500));
        laptops.add(new Laptop("Asus", "Windows11", "white", 8, 512, 3600));

        Map<String, String> filterParams = getFilterParams();
        List<Laptop> filteredLaptops = filterLaptops(laptops, filterParams);

        if (filteredLaptops.isEmpty()) {
            System.out.println("Ноутбуки не найдены");
        } else {
            System.out.println("Найденные ноутбуки:");
            for (Laptop laptop : filteredLaptops) {
                System.out.println(laptop);
            }
        }
    }

    public static Map<String, String> getFilterParams() {
        Map<String, String> filterParams = new HashMap<>();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите цифру, соответствующую необходимому критерию:");
        System.out.println("1 - ОЗУ");
        System.out.println("2 - Объем ЖД");
        System.out.println("3 - Операционная система");
        System.out.println("4 - Цвет");
        System.out.println("5 - Цена");
        System.out.println("6 - Брэнд");

        int criteria = scanner.nextInt();

        switch (criteria) {
            case 1:
                System.out.println("Введите минимальный объем ОЗУ:");
                int ram = scanner.nextInt();
                filterParams.put("ram", String.valueOf(ram));
                break;
            case 2:
                System.out.println("Введите минимальный объем ЖД:");
                int hdd = scanner.nextInt();
                filterParams.put("hdd", String.valueOf(hdd));
                break;
            case 3:
                System.out.println("Введите операционную систему:");
                String os = scanner.next();
                filterParams.put("os", os);
                break;
            case 4:
                System.out.println("Введите цвет:");
                String color = scanner.next();
                filterParams.put("color", color);
                break;
            case 5:
                System.out.println("Введите цену:");
                String price = scanner.next();
                filterParams.put("price", price);
                break;
            case 6:
                System.out.println("Введите брэнд:");
                String brand = scanner.next();
                filterParams.put("brand", brand);
                break;
            default:
                System.out.println("Некорректный ввод");
        }

        return filterParams;
    }

    public static List<Laptop> filterLaptops(List<Laptop> laptops, Map<String, String> filterParams) {
        List<Laptop> filteredLaptops = new ArrayList<>();

        for (Laptop laptop : laptops) {
            boolean isMatch = true;

            for (Map.Entry<String, String> entry : filterParams.entrySet()) {
                switch (entry.getKey()) {
                    case "ram":
                        if (laptop.getRam() < Integer.parseInt(entry.getValue())) {
                            isMatch = false;
                        }
                        break;
                    case "hdd":
                        if (laptop.getHdd() < Integer.parseInt(entry.getValue())) {
                            isMatch = false;
                        }
                        break;
                    case "os":
                        if (!laptop.getOs().equals(entry.getValue())) {
                            isMatch = false;
                        }
                        break;
                    case "color":
                        if (!laptop.getColor().equals(entry.getValue())) {
                            isMatch = false;
                        }
                        break;
                    case "price":
                        if (laptop.getPrice() > Integer.parseInt(entry.getValue())) {
                            isMatch = false;
                        }
                        break;
                    case "brand":
                        if (!laptop.getBrand().equals(entry.getValue())) {
                            isMatch = false;
                        }
                        break;
                    default:
                        System.out.println("Некорректный ввод");
                }
            }

            if (isMatch) {
                filteredLaptops.add(laptop);
            }
        }

        return filteredLaptops;
    }
}
