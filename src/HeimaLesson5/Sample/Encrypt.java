package HeimaLesson5.Sample;

public class Encrypt {
    /*数字加密 ：
    1.将数字中的每位数都进行+5、对10取余的操作；
    2.将求得的数字顺序进行反转，最终得到加密后的新数字
    * */
    public static void main(String[] args) {
        System.out.println(encrypt(1983));
    }

    public static int encrypt(int number) {
        int i = 0;
        int temp = 0; // 存储按顺序各个位+5、对10取余操作后的数字
        int code = 0;// 最终加密后的数字
        do {
            i++;
            int n = number % 10;// 取余数
            number /= 10;// 取商
            n = (n+5)%10;
            temp += n*(Math.pow(10,i-1));
        }
        while (number != 0);

        // 将temp翻转
        for ( ; i != 0 ; i--) {
            number = temp % 10;
            temp /= 10;
            code += number * Math.pow(10,i-1);
        }
        return code;
    }
}
