package youtube;

import java.util.Scanner;

public class ex6Massivy {
    public static void main(String[] args) {
//        int[] nums = new int[5];
//        nums[0]=45;
//        nums[1]=32;
//        nums[2]=1;
//        nums[3]=9;
//        nums[4]=3;
//        int res = nums[2] + nums[3];
//        System.out.println(res);
//
//        float[] nums2 = new float[] {5.0f, 6.45f, 89.984f};
//        System.out.println(nums2[2]);
//        for (int i = 0; i < nums2.length; i++) {
//            System.out.println("el " + nums2[i]);
//        }
        int[] arr = new int[4];
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            System.out.println("input number ");
            int value = scanner.nextInt();
            arr[i] = value;
        }
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min)
                min = arr[i];
        }
        System.out.println("min " + min);
    }
}
