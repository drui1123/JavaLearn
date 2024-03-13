package HeimaLesson3.Array;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Array_RandomRank {
    public static void main(String[] args) {
        /*某部门有5个人员，依次录入所有人员工号后，随机顺序进行汇报演讲*/

        // 录入所有员工工号
        int[] codes = new int[5];  //定义一个动态初始化数组，存储工号
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < codes.length; i++) {
            System.out.printf("请输入第" + (i+1) + "个员工的工号：");
            int code = sc.nextInt();
            codes[i] = code;
        }

        // 随机排序
        Random r = new Random();
        for (int i = 0; i < codes.length; i++) {
            int index = r.nextInt(codes.length);
            int temp = codes[i];
            codes[i] = codes[index];
            codes[index] = temp;
        }

        // 显示顺序结果
        System.out.println(Arrays.toString(codes));
    }
}
