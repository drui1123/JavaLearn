package HeimaLesson4.Method;

public class DefineMethod {
    /*掌握定义方法的格式，搞清楚使用方法的注意事项
    * 1.方法放置的前后顺序无所谓，但是一个方法不能定义在另一个方法里面
    * 2.方法的返回值类型需要与声明的类型一致，当声明为void（无返回值）时内部不能用return语句
    * 3.方法中return语句后面的代码不会被执行
    * 4.方法不调用就不会执行，调用方法时，传给方法的数据必须严格匹配声明的形参类型与数量
    * 5.void型的方法只能直接调用，不能通过变量接收，也不能直接输出调用（例如sout（方法））*/
    public static void main(String[] args) {
        //需求：很多程序员都要进行两个整数求和的操作
        //李工
        int sum1 = GetSum(10,20);
        System.out.println("和是："+sum1);

        //张工
        int sum2 = GetSum(30,20);
        System.out.println("和是："+sum2);

    }

    //格式：修饰符 返回值类型 方法名(形参列表)｛
    //     方法体代码
    //     return 返回值
    //          ｝
    public static int GetSum(int a, int b) {
        int c = a + b;
        return c;
    }
}
