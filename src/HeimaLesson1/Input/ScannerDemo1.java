package HeimaLesson1.Input;

import java.util.Scanner;

public class ScannerDemo1 {
    public static void main(String[] args) {
//        1.导包Scanner，一般不需要手动导，idea会自动完成导包
//        2.直接写代码：获取一个键盘扫描器对象
        Scanner sc = new Scanner(System.in);

//        开始调用sc的功能，来接受用户键盘输入的数据
        System.out.println("请输入您的年龄： ");
        int age = sc.nextInt();  //开始用户输入一个整数，直到用户输了回车键后，才会拿到数据
        System.out.println("您的年龄是：" + age);

        System.out.println("请输入您的名字：  ");
        String name = sc.next();  //开始等待用户输入一个字符串，直到用户输了回车键后，才会拿到数据
        System.out.println("您的名字是：" + name);
    }

}
