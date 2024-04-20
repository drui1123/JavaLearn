package HeimaLesson5.Sample;

import HeimaLesson4.Method.PrintArray;

import java.util.Random;
import java.util.Scanner;

public class LottoSimulate {
    /*模拟双色球:
    1，用户投注一组号码：6个红色球号+1个蓝色球号。红色球号从1~33中选择；蓝色球号丛1~16中选择
    2.随机生成一组中奖号码
    3.判断中奖号码
    * */
    static Scanner sc = new Scanner(System.in);
    static Random random = new Random();
    public static void main(String[] args) {
        int[] hit = CreateHit();
        System.out.print("您下注的号码是：");
        PrintArray(hit);
        System.out.println("正在抽奖，请稍后...");
        int[] target = CreateTarget();
        System.out.print("本期中奖号码是：");
        PrintArray(target);
        IsHit(hit,target);
    }

    //用户生成一组号码
    public static int[] CreateHit(){
        int[] hit = new int[7];
        Input:
        for (int i = 0; i < hit.length; i++) {
            int bound = i< (hit.length-1) ? 34 : 17;
            while (true) {
            System.out.print("请输入您的第" + (i+1) + "个号码" + "(范围是：" + "1~" + (bound-1) + "):");
            int temp = sc.nextInt();
                if (temp > 0 && temp < bound) {
                    hit[i] = temp;
                    continue Input;
                } else {
                    System.out.println("您输入的号码有误，请重新输入！");
                    continue ;
                }
            }
        }

        return hit;
    }

    //生成中奖号码
    public static int[] CreateTarget(){
        int[] target = new int[7];
        for (int i = 0; i < target.length; i++) {
            int bound = i< (target.length-1) ? 34 : 17;
            target[i] = random.nextInt(1,bound);
        }
        return target;
    }


    // 判断是否中奖
    public static void IsHit(int[] bet, int[] target){
        if (CampareArray(bet,target)){
            System.out.println("恭喜您中奖了！");
        }
        System.out.println("很遗憾，您没有中奖，请您再接再厉！");
    }

    // 判断两个数组是否完全一样，完全一样返回真，否则返回假
    public static boolean CampareArray(int[] a, int[] b){
        if (a == null && b == null){
            return true;
        }

        if (a == null || b == null){
            return false;
        }

        if (a.length != b.length){
            return false;
        }

        for (int i = 0; i < a.length; i++) {
            if (a[i] != b[i]){
                return false;
            }
        }

        return true;
    }

    // 打印输出数组所有元素
    public static void PrintArray(int[] arr){
        // 处理数组为null的情形
        if (arr == null){
            System.out.println(arr);
            return; // 跳出本方法
        }

        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            System.out.print( i== arr.length-1 ? arr[i] : arr[i] + ", " );
        }
        System.out.println("]");
    }


}
