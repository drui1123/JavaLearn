package HeimaLesson4.Method;

public class PrintArray {
    /*通过方法设计打印输出Int类型数组，形式为：[元素1，元素2，...]
    * */
    public static void main(String[] args) {
        int[] arr1 = {11,22,33};
        PrintArray(arr1);
        int[] arr2 = null;
        PrintArray(arr2);
        int[] arr3 = {};
        PrintArray(arr3);
    }

    public static void PrintArray(int[] arr){
        // 处理数组为null的情形
        if (arr == null){
            System.out.println(arr);
            return; // 跳出本方法
        }

        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            System.out.print( i== arr.length-1 ? arr[i] : arr[i] + ", " );
        }
        System.out.println("]");
    }
}
