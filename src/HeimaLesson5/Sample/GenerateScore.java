package HeimaLesson5.Sample;

import java.util.Scanner;

public class GenerateScore {
    /*评委打分案例：去掉1个最高分、最低分，剩余分数的平均值作为选手分值
    * */
    public static void main(String[] args) {
        System.out.println("最终选手的分数是：" + GetScore(1));
    }

    // 求取选手最终分数
    public static double GetScore(int number){
        Scanner sc = new Scanner(System.in);
        double[] scores = new double[number];
        for (int i = 0; i < number; i++) {
            System.out.print("请输入第" + (i+1) + "个选手的分数：");
            scores[i] = sc.nextDouble();
        }
        double score;
        score = number < 3 ? GetSum(scores)/number : (GetSum(scores) - GetMax(scores) - GetMin(scores)) / (number -2 );
        return score;
    }

    // 求取数组最大值
    public static double GetMax(double[] scores){
        double score = scores[0];
        for (int i = 1; i < scores.length; i++) {
            score = scores[i] > score ? scores[i] : score;
        }
        return score;
    }

    // 求取数组最小值
    public static double GetMin(double[] scores){
        double score = scores[0];
        for (int i = 1; i < scores.length; i++) {
            score = scores[i] < score ? scores[i] : score;
        }
        return score;
    }

    // 求取数组元素和
    public static double GetSum(double[] scores){
        double score = scores[0];
        for (int i = 1; i < scores.length; i++) {
            score += scores[i];
        }
        return score;
    }



}
