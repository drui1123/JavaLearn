package HeimaLesson6.Oop.ThisDemo;

public class Test_Student {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "波妞";
        s1.chinese_score = 100;
        s1.math_score = 100;
        s1.score = 358;
        s1.PrintTotalScore();
        s1.PrintAverageScore();
        s1.PrintThis();
        System.out.println(s1);
        s1.PrintPass(300);

        Student s2 = new Student();
        s2.name = "波黑";
        s2.chinese_score = 98;
        s2.math_score = 59;
        s1.score = 288;
        s2.PrintTotalScore();
        s2.PrintAverageScore();
        s2.PrintThis();
        System.out.println(s2);
        s2.PrintPass(300);
    }
}
