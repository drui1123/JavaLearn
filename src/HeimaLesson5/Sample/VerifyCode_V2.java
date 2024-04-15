package HeimaLesson5.Sample;

import java.util.Random;

public class VerifyCode_V2 {
    /*生成一个指定位数的随机验证码，内容包括数字、大小写字母
     * */
    public static void main(String[] args) {
        System.out.println(GenerateCode(5));
    }

    public static String GenerateCode(int number) {
        char[] CodeArray = new char[number];
        Random random = new Random();
        char n = '0';
        for (int i = 0; i < CodeArray.length; i++) {
            //先随机一个0、1、2数字，0代表接下来随机数字，1代表接下来大写字母，2代表接下来随机小写字母
            int type = random.nextInt(3);
            switch (type) {
                case 0:// 随机数字
                    n = Character.forDigit ( random.nextInt(10) , 10); // 将随机的数字转换为对应的字符数字
                    break;
                case 1:// 随机小写字母
                    n = (char) (random.nextInt(26) + 65);// 后面也可以+'A')
                    break;
                case 2:// 随机大写字母
                    n = (char) (random.nextInt(26) + 97);// 后面也可以+'a'
                    break;
            }
            CodeArray[i] = n;
        }
        String code =String.valueOf(CodeArray);
        return code;
    }
}
