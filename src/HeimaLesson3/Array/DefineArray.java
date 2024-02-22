package HeimaLesson3.Array;

public class DefineArray {
    public static void main(String[] args) {
        /*静态初始化数组：
        1.数据类型[] 数组名 = new 数据类型[]{元素1,元素2,...}；
        2.数据类型[] 数组名 = {元素1,元素2,...}；
        3.数据类型 数组名[] = {元素1,元素2,...}；

        动态初始化数组,先确定数据类型与数组长度，后面再动态赋值
        数据类型[] 数组名 = new 数据类型[数组长度];
        */

        //静态初始化数组
        int[] ages1 = new int[]{12,25,51};
        int[] ages2 = {21,14,51};   //推荐这种形式
        double ages3[] = {25,35,41};

        //数组变量(数组名)存放的是数组数据所存放的内存地址,是一种引用数据类型
        System.out.println(ages1);
        System.out.println(ages2);
        System.out.println(ages3);

        //空数组可能不会分配地址，也可能会分配地址，与数据类型有关
        char[] names1 = {};
        System.out.println(names1); //没有地址
        String[] names2 = {};
        System.out.println(names2); //有地址

        //动态初始化数组,先确定数据类型与数组长度，后面再动态赋值
        int[] ayy1 = new int[3];
        System.out.println(ayy1[2]);   //int类型默认是0
        ayy1[0] = 10;
        System.out.println(ayy1[1]);

        String[] Str = new String[3];
        System.out.println(Str[0]);   //String类型默认是null
    }
}
