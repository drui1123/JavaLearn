package HeimaLesson2.Structure;

public class StructureIf {
    public static void main(String[] args) {
        //需求1：测量用户体温，如果高于37℃则报警
        double t = 38.9;
        if (t > 37) {
            System.out.println("这个人体温高于37度，赶紧把他带走！");
        }

        //需求2：发红包，如果钱包余额够就发出红包，否则提示余额不足
        double balance = 99;
        double money = 200;
        if (money > balance) {
            System.out.println("账户余额不足！");
        }
        else System.out.println("红包发送成功！");

        //需求3：某个公司有一个绩效系统，根据员工的打分输出对应的绩效级别。
        // [0,60）→D；[60,80)→C；[80，90）→B；[90，100]→A
        int score = 83;
        if (score >= 0 && score < 60){
            System.out.println("您的绩效级别是：D");
        } else if (score >= 60 && score < 80) {
            System.out.println("您的绩效级别是：C");
        } else if (score >= 80 && score< 90) {
            System.out.println("您的绩效级别是：B");
        } else if (score >= 90 && score<=100) {
            System.out.println("您的绩效级别是：A");
        }else System.out.println("您输入的绩效数据有误！");
    }
}
