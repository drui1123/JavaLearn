package HeimaLesson3.Array;

public class GetArrayData {
    public static void main(String[] args) {
        /*掌握访问数组的基本用法
        1.访问单个元素
        2.获取数组总长度
        3.数组遍历*/

        //初始化数组
        int[] ages1 = {12,24,36};
        String[] names1 = {};

        //访问数组元素
        ages1[0] = 22;
        System.out.println(ages1[0]);

        //获取数组长度
        System.out.println(ages1.length);
        System.out.println(names1.length);  //空数组长度是0

        //数组遍历,写法：ages1.fori
        for (int i = 0; i < ages1.length; i++) {
            System.out.println(ages1[i]);
        }
    }
}
