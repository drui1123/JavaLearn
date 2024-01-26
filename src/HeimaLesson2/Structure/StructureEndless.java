package HeimaLesson2.Structure;
/*
掌握死循环的用法
*/

public class StructureEndless {
    public static void main(String[] args) {
    // 写法1
        /*for (int i = 0; true ; i++) // 或者: for ( ; ; )
        {
            System.out.println("Hello World1");
        }*/

        /*while (true){
            System.out.println("Hello World2");
        }*/

        do {
            System.out.println("Hello World3");
        }
        while (true);
    }
}
