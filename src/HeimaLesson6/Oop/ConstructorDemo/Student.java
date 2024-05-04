package HeimaLesson6.Oop.ConstructorDemo;
/*构造器的使用：，用于赋初值
1.构造器是一种特殊的方法，其没有返回值关键字且名字与类的名字一致；
2.类在设计时如果不写构造器，则Java会为类自动生成一个无参数构造器；
3.一旦定义了有参数构造器，Java就不会自动生成无参数构造器，建议自己手写一个无参数构造器
* */
public class Student {
    String name;
    double score;

    // 无参数构造器
    public Student(){
        System.out.println("无参数构造器被触发执行了~");
    }
    // 有参数构造器
    public Student(String name , double score){
        System.out.println("有参数构造器被触发执行了~");
        this.name = name;
        this.score = score;
    }
}
