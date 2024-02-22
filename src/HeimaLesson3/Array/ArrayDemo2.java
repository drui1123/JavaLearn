package HeimaLesson3.Array;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayDemo2 {
    /*某歌唱比赛需要录入6名评委打分，录入完毕后输出平均分*/

    public static void main(String[] args) {
        double[] scores = new double[6];
        Scanner sc = new Scanner(System.in);
        double sum = 0;
        for (int i = 0; i < scores.length; i++) {
            System.out.printf("请第%d位裁判输入成绩:", i + 1);
            scores[i] = sc.nextDouble();
            sum += scores[i];
        }
        System.out.println("选手的平均成绩是：" + sum / scores.length );
    }
}