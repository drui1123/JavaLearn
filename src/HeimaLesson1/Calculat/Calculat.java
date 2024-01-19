package HeimaLesson1.Calculat;

public class Calculat {
    public static void main(String[] args) {

//        -----------------------------
//        基本运算符
        /*int a = 10;
        int b = 2;
        System.out.println(a + b);
        System.out.println(a - b);
        System.out.println(a * b);
        System.out.println(a / b); // 两个整型数相除还是一个整数
        System.out.println(5 / 2); // 两个整数相除的结果还是一个整数：2.5→2
        System.out.println(a % b); // 取余数
        System.out.println(5.0 / 2);
        int i = 5;
        int j = 2;
        System.out.println((1.0 * i) / j);*/

//        "+"符号可以做为连接符号使用，能运算则运算、不能运算则连接
        /*int a2 = 5;
        System.out.println("abc" + 5); // abc5
        System.out.println(a2 + 5); // 10
        System.out.println("itheima" + a2 + 'a'); // itheima5a
        System.out.println(a2 + 'a' + "itheima"); // 102itheima,'a'的ASCII码为97*/

//        -----------------------------
//        自加、自减运算符
/*        int a = 10;
        int b = 10;
        int c = 10;
        int d = 10;
        System.out.println(++a); // 11,先运算后用
        System.out.println(b++); //10,先用后运算
        System.out.println(b);// 11
        System.out.println(++c + c); // 22,先运算后用
        System.out.println(d++ + d); // 21,先用后运算*/

//        -----------------------------
//        赋值运算符
        double a = 9.5;
        double b = 520;
        a += b; //扩展赋值运算符隐含了强制类型转换，即 a = (double)a + b,

    }
}
