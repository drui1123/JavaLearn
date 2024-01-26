package HeimaLesson2.Structure;

public class StructureGoto {
    public static void main(String[] args) {
        for (int i = 0; i <= 5; i++) {
            System.out.println("It's Day" + i);
            if (i == 3)
                break; // break用于跳出当前所在循环或者switch结构
        }

        for (int i = 0; i <= 4; i++) {
            if (i == 2) {
                continue; // continue用于结束本次循环，直接跳到下一次循环
            }
            System.out.println("It's Week" + i);
        }
    }
}
