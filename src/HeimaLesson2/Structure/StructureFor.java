package HeimaLesson2.Structure;
/*
掌握for的用法：
*/

public class StructureFor {
    public static void main(String[] args) {
    /*
    // 打印多行文字
        for (int i = 0; i < 3; i++) {
            System.out.println("Hello World!" + "i=" + i );*/

        // 批量产生与处理数据，例如求1~100的奇数和
        // 方法1
        int sum = 0;
        for (int i = 1; i <= 100; i += 2) {
            sum += i;
        }
        System.out.println("1~100的奇数和为：" + sum);

        // 方法2
        int sum2=0;
        for (int i = 0; i <= 100; i++) {
            if (i % 2 == 1) {
                sum2 += i;
            }
        }
        System.out.println("1~100的奇数和为：" + sum);
    }
}
