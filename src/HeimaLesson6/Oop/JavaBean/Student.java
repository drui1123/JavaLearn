package HeimaLesson6.Oop.JavaBean;

/*实例类的编程
1.特征：
    a.类中的成员变量都是私有类型
    b.对外要提供getxxx、setxxx方法
    c.类中必须要有一个公共的无参数构造器，其他的构造器可写可不写
    d.类中除了以上成员外，没有其他成员
2.用途:
    用来创建对象和保存数据，将程序分层设计，操作方法可以新建一个操作类
* */
public class Student {
    private String name;
    private double score;

    public Student(String name, double score) {
        this.name = name;
        this.score = score;
    }

    public Student() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }
}
