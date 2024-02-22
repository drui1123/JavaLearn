package HeimaLesson3.Array;

import java.util.Arrays;

public class Array_GetMaxMin {
    /*找出数组中的最大最小值*/

    public static void main(String[] args) {
        int[] arr1 = {15, 9000, 10000, 20000, 9500, 12, -2, -5};

        //方法1
        int Max1 = arr1[0];
        int Min1 = Max1;
        for (int i = 1; i < arr1.length; i++) {
            Max1 = (Max1 > arr1[i] ? Max1 : arr1[i]);
            Min1 = (Min1 < arr1[i] ? Max1 : arr1[i]);
            }
        System.out.println("数组最大值是：" + Max1);
        System.out.println("数组最小值是：" + Min1);

        //方法2
        int Max2 = Arrays.stream(arr1).max().getAsInt();
        int Min2 = Arrays.stream(arr1).min().getAsInt();
        System.out.println("数组最大值是：" + Max2);
        System.out.println("数组最小值是：" + Min2);
    }
}
