package HeimaLesson2.Structure;
/*
掌握do-while循环的用法:
先执行，后判断
*/

public class StructureDoWhile {
    public static void main(String[] args) {
        int i = 1;
        do {
            System.out.println("Hello World!" + i);
            i++;
        }
        while (i<=5);
    }
}
