package HeimaLesson3.Array;

public class ArrayMaxOrMin {
    /*找出数组中的最大最小值*/

    public static void main(String[] args) {
        int[] arr1 = {15, 9000, 10000, 20000, 9500, 12, -2, -5};
        int Max1 = arr1[0];
        int Min1 = Max1;
        for (int i = 1; i < arr1.length; i++) {
            Max1 = (Max1 > arr1[i] ? Max1 : arr1[i]);
            Min1 = (Min1 < arr1[i] ? Max1 : arr1[i]);
            }
        System.out.println(Max1);
        System.out.println(Min1);
    }
}
