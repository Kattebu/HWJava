package sem3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class main {
    // ex 1 Даны сведения об экспортируемых товарах: указывается наименование товара, страна, экспортирующая товар,
    // и объем поставляемой партии в штуках. Найти страны, которые экспортируют данный(введенный с кл-ы) товар,
    // и общий объем его экспорта.
    public static void main(String[] args) {
        Item item1 = new Item("qwe", "asd1", 1);
        Item item2 = new Item("qwe1", "asd2", 2);
        Item item3 = new Item("qwe", "asd3", 3);
        Item item4 = new Item("qwe3", "asd4", 4);
        List<Item> itemList = new ArrayList<>();
        itemList.add(item1);
        itemList.add(item2);
        itemList.add(item3);
        itemList.add(item4);
        System.out.println("itemList " + itemList);
        Scanner scanner = new Scanner(System.in);
        String searchItem = scanner.nextLine();
        List<String> countries = getCountries(itemList, searchItem);
        int sumVolume = sumVolume(itemList, searchItem);
        System.out.println("sumVolume " + sumVolume);
        System.out.println("countries " + countries);
    }

    /**
     * @param itemList
     * @param searchItem
     * @return
     * @apiNote Даны сведения об экспортируемых товарах: указывается наименование товара, страна, экспортирующая товар,
     * и объем поставляемой партии в штуках. Найти страны, которые экспортируют данный(введенный с кл-ы) товар,
     * и общий объем его экспорта.
     */
    private static ArrayList<String> getCountries(List<Item> itemList, String searchItem) {
        ArrayList<String> countries = new ArrayList<>();
        for (Item item : itemList) {
            if (item.getName().equals(searchItem)) {
                countries.add(item.getCountry());
            }
        }
        return countries;
    }

    private static int sumVolume(List<Item> itemList, String searchItem) {
        int sumVolume = 0;
        for (Item item : itemList) {
            if (item.getName().equals(searchItem)) {
                sumVolume += item.getVolume();
            }
        }
        return sumVolume;
    }
}
