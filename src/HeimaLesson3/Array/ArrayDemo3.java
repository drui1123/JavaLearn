package HeimaLesson3.Array;

public class ArrayDemo3 {
    /*认识多个变量指向同一个数组对象的形式，并掌握其注意事项*/
    public static void main(String[] args) {
        int[] arr1 = {11, 22, 33};
        int[] arr2 = arr1;  //把第一个数组变量的地址赋给第二个数组变量
        System.out.println(arr1);
        System.out.println(arr2);   //两个数组变量的地址一样

        arr1[1] = 99;
        System.out.println(arr2[1]);

        int[] arr3 = new int[arr1.length];
        System.out.println(arr3);   //对第3个数组创建了一个新的地址

        arr3 = arr1;
        System.out.println(arr3);   //改变了第3个数组变量的地址，指向第一个数组

        int[] arr4 = null;
        //arr4 = arr2;
        System.out.println(arr4[1]);

    }
}
