package lesson1;

import java.util.Scanner;

public class ex4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("введите длину массива: ");
        int n = scanner.nextInt();
        int[] nums = new int[n]; //todo: возможно и так int[] nums = {1,2,3,4};
        for (int i = 0; i < n; i++) {
            nums[i] = scanner.nextInt();
        }

        System.out.println(checkSymetr(nums));

        for (int i = 0; i < n; i++) {
            System.out.printf("nums[%d] = %d \n", i, nums[i]);
        }
    }

    /**
     * @apiNote Дан массив целых чисел. Верно ли, что массив является симметричным.
     * @param nums численный массив
     * @return сообщение str о симметричности
     */

    private static String checkSymetr(int[] nums) {
        for (int i = 0; i < nums.length / 2; i++) {
            if (nums[i] != nums[nums.length - 1 - i]) {
                return "массив несимметричен";
            }
        }
        return "массив симметричен";
    }
}
