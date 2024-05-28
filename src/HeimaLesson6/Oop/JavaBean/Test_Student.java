package HeimaLesson6.Oop.JavaBean;

public class Test_Student {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.setName("播妞");
        s1.setScore(99);

        StudentOperator operator = new StudentOperator(s1);
        operator.PrintPass(60);
    }

}
