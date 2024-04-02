package HeimaLesson4.Method;

public class TransferParameter {
    /*了解并掌握方法参数传递的机制：
    1.调用方法时，将拷贝一个实参值的副本传递给方法的形参
    2.引用类型传递的是变量所在的地址
    * */
    public static void main(String[] args) {
        int a = 10;
        ChangeInt(a); // 值不会改变
        System.out.println("调用方法后a的值为：" + a);

        int[] arr = {10,20,30};
        ChangeArr(arr); // 值会改变，因为传递的是地址
        System.out.println("调用方法后arr的第二个元素值为：" + arr[1]);
    }

    public static void ChangeInt(int a){
        a = 20;
    }

    public static void ChangeArr(int[] a){
        a[1] = 33;
    }
}



