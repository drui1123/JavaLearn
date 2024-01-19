package HeimaLesson1.variable;

public class VariableTypeConvert {
    public static void main(String[] args) {
//        自动类型转换：范围小的变量可以直接赋值给范围大的变量
        byte aa = 12;
        int bb = aa;

        char ch = 'A';
        int ii = ch;
        System.out.println(ii);

//        ---------------------------------------
//       表达式的自动类型转换：
        /*1. 最终结果类型由表达式中的最高类型决定；
        2. byte、short、char直接转换成int类型参与运算*/
        byte a = 10;
        int b = 20;
        long c = 30L;
        long rs = a + b + c;

        byte i = 10;
        byte j = 30;
        int rs2 = i + j;
        System.out.println(rs2);

//        ---------------------------------------
//        强制类型转换：
        int aaa = 1500;
        byte bbb = (byte) aaa; // 强制类型转换，只保留后8位
        System.out.println(bbb);

        double d = 99.5;
        int m = (int) d; // 强制类型转换，只保留整数部分(99)
        System.out.println(m);

    }
}
