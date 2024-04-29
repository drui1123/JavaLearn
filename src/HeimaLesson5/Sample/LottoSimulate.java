package HeimaLesson5.Sample;

import java.util.Random;
import java.util.Scanner;

public class LottoSimulate {
    /*模拟双色球:
    1，用户投注一组号码：6个红色球号+1个蓝色球号。红色球号从1~33中选择；蓝色球号丛1~16中选择
    2.红色球号码不能重复
    3.随机生成一组中奖号码
    4.判断中奖号码
    * */
    static Scanner sc = new Scanner(System.in);
    static Random random = new Random();
    public static void main(String[] args) {
        // 下注
        int[] hit = CreateHit();
        System.out.print("您下注的号码是：");
        PrintArray(hit);
        // 抽奖
        System.out.println("正在抽奖，请稍后...");
        int[] target = CreateTarget();
        System.out.print("本期中奖号码是：");
        PrintArray(target);
        // 公布
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
                if (temp < 1 || temp >= bound){
                    System.out.println("您输入的号码超出范围，请重新输入！");
                } else if (IsExist(hit , temp) && i < hit.length-1) {
                    System.out.println("您输入的号码已存在，请重新输入！");
                }else {
                    hit[i] = temp;
                    continue Input;
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
            while (true) {
                int temp = random.nextInt(1,bound);
                if (!IsExist(target , temp) || i == target.length-1){
                    target[i] = temp;
                    break;
                }
            }
        }
        return target;
    }


    // 判断中奖
    public static void IsHit(int[] bet, int[] target){
        int[] flags = EqualFlags(bet , target);
        int hit_blue = flags[flags.length-1]; // 蓝球中奖个数
        int hit_red = ArraySum(flags) - hit_blue; // 红球中奖个数
        if (hit_blue == 1){
            switch (hit_red){
                case 6:
                    System.out.println("恭喜您中了一等奖，奖金1000万元！");
                    break;
                case 5:
                    System.out.println("恭喜您中了三等奖，奖金3000元！");
                    break;
                case 4:
                    System.out.println("恭喜您中了四等奖，奖金200元！");
                    break;
                case 3:
                case 2:
                    System.out.println("恭喜您中了五等奖，奖金100元！");
                    break;
                case 1:
                case 0:
                    System.out.println("恭喜您中了六等奖，奖金5元！");
                    break;
            }
        }else {
            switch (hit_red){
                case 6:
                    System.out.println("恭喜您中了二等奖，奖金500万元！");
                    break;
                case 5:
                    System.out.println("恭喜您中了四等奖，奖金200元！");
                    break;
                case 4:
                    System.out.println("恭喜您中了五等奖，奖金10元！");
                    break;
                default:
                    System.out.println("对不起，您未中奖，请再接再厉！");
                    break;
            }
        }
    }

    // 判断数组中是否已存在某元素
    public static boolean IsExist(int[] arr , int num){
        for (int j : arr) {
            if (j == num) {
                return true;
            }
        }
        return false;
    }

    // 返回两个数组各元素是否相等的标志位，相同为1，不同为0
    public static int[] EqualFlags(int[] arr1, int[] arr2){
        int[] flags = new int[arr1.length];
        for (int i = 0; i < flags.length; i++) {
            flags[i] = (arr1[i] == arr2[i]) ? 1 : 0;
        }
        return flags;
    }

    // 数组元素求和
    public static int ArraySum(int[] arr) {
        int sum = 0;
        for (int j : arr) {
            sum += j;
        }
        return sum;
    }

    // 打印输出数组所有元素
    public static void PrintArray(int[] arr){
        // 处理数组为null的情形
        if (arr == null) {
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
