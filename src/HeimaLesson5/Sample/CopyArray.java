package HeimaLesson5.Sample;

import HeimaLesson4.Method.PrintArray;

public class CopyArray {
    public static void main(String[] args) {
        int[] arr1 = {10, 20, 30, 40};
        int[] arr2 = CopyArray(arr1);
        arr2[0] = 11;
        PrintArray(arr1);
        PrintArray(arr2);
        System.out.println("arr1的地址为：" + arr1);
        System.out.println("arr2的地址为：" + arr2);
    }


    public static int[] CopyArray(int[] arr) {
        int[] arr2 = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            arr2[i] = arr[i];
        }

        return arr2;
    }

    public static void PrintArray(int[] arr) {
        // 处理数组为null的情形
        if (arr == null) {
            System.out.println(arr);
            return; // 跳出本方法
        }

        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(i == arr.length - 1 ? arr[i] : arr[i] + ", ");
        }
        System.out.println("]");

    }
}
