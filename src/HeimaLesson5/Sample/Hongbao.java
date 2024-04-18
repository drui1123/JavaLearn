package HeimaLesson5.Sample;

import java.util.Random;
import java.util.Scanner;

public class Hongbao {
    /*抢红包案例：
    * */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int times = 0;
        double[] money = {11,22,33,44,55};
        System.out.print("请输入抢红包的人数：");
        while (true){
            times = sc.nextInt();
            if (times > money.length){
                System.out.print("抢红包的人数大于红包总个数" + money.length + "请重新输入人数：");
                continue;
            }
            break;
        }
        GetHongbao(money,money.length,times);
    }

    // 按次数抽红包，number为所剩红包个数，times为所剩抽红包次数
    public static void GetHongbao(double[] money, int number ,int times){
        if (times >= 1) {
            Random random = new Random();
            int LuckyIndex = random.nextInt(number);
            money = OutHongbao(money, LuckyIndex);
            times--;
            number--;
            GetHongbao(money, number, times);
        }
    }

    // 单次取出指定顺序的红包,返回抽完后的红包数组
    public static double[] OutHongbao(double[] money, int index){
        System.out.println("本次抽取的红包为：" + money[index]);
        for (int i = index; i < money.length - 1; i++) {
            money[i] = money[i+1];
            }
        return money;
    }

}


