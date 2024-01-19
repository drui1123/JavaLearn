package HeimaLesson1.variable;

public class VariableType {
    public static void main(String[] args) {
//        掌握基本数据类型的使用
//        1. byte short int long
        byte a = 127;
//        byte a2 = 128; // 越界了
        short s = 13244;
//        short s2 = 42323451; //越界了
        int i = -23451;
//        随便写一个整型字面量默认是int型，如果需要转为long型，要在后面加L（←推荐）或者l
//        long lg = 12315412415； // 默认是int型的
        long lg2 = 12315412415L;
//        System.out.println(lg2);

//        2. float double
//        注意：小数字面量默认为double型，如果希望是float型，需要在后面加上F或者f
        float f = 3.14F;
        double f2 = 55.3125f;

//        3. char字符型,实际存储的是ASCII编码值
        char ch = 'a';
        char ch2 = '中';

//        4. boolean
        boolean flag = true;
        boolean flag2 = false;

//        引用数据类型
//        1. String字符串
        String name = "张三";


    }
}
