package HeimaLesson6.Oop.ThisDemo;

/*
* 一个文件中可以写多个class类，但是只能一个用public修饰，
* 且public修饰的类名必须为文件名*/
public class Student {
    // 属性
    String name;
    double chinese_score;
    double math_score;
    double score;

    // 方法
    public void PrintTotalScore(){
        System.out.println(name + "的总成绩是：" + (chinese_score+math_score));
    }

    public void PrintAverageScore(){
        System.out.println(name + "的平均成绩是：" + (chinese_score+math_score)/2);
    }

    public void PrintThis(){
        System.out.println(this);
    }

    public void PrintPass(double score){
        // 利用this指针解决变量冲突问题
        if (this.score > score){
            System.out.println("恭喜您考上了哈佛大学!");
        }
        else System.out.println("很遗憾，您落榜了~");
    }
}