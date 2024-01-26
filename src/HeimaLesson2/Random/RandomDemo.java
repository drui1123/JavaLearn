package HeimaLesson2.Random;
/*
猜数字游戏
*/

import java.nio.CharBuffer;
import java.util.Random;
import java.util.Scanner;

public class RandomDemo {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        int LuckyNumber =  random.nextInt(1, 101); // 生成一个1~100之间的随机整数
        while (true) {
            System.out.println("请输入您猜测的数字：");
            int GuessNumber = scanner.nextInt();
            if (GuessNumber == LuckyNumber) {
                System.out.println("恭喜您猜对了！");
                break;
            } else if (GuessNumber > LuckyNumber) {
                System.out.println("对不起，您输入的数据过大！");
            }else System.out.println("对不起，您输入的数据过小！");
        }
    }
}
