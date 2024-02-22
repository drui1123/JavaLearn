package HeimaLesson3.Array;

import java.util.Arrays;

public class ArrayDemo1 {
    /*某部门5个员工的销售额分别是：16、26、36、6、100，计算部门总销售额*/
    public static void main(String[] args) {
        int[] sales = {16,26,36,6,100};
        int sum1 = Arrays.stream(sales).sum();
        //方法1
        System.out.println(sum1);
        //方法2
        int sum2 = 0;
        for (int i = 0; i < sales.length; i++) {
            sum2 += sales[i];
        }
        System.out.println(sum2);
    }
}
