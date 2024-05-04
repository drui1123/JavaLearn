package HeimaLesson6.Oop.ConstructorDemo;

public class Test_Student {
    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student("波仔", 130);
        System.out.println(s2.name);
        System.out.println(s2.score);
    }
}
