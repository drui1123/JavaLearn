package HeimaLesson6.Oop.JavaBean;

public class StudentOperator {
    private Student student;

    public StudentOperator(Student student) {
        this.student = student;
    }

    public void PrintPass(double score){
        // 利用this指针解决变量冲突问题
        if (student.getScore() > score){
            System.out.println("恭喜您考上了哈佛大学!");
        }
        else System.out.println("很遗憾，您落榜了~");
    }
}
