package HeimaLesson2.Structure;
/*
掌握While循环的用法
知道循环几次：建议用for循环。不知道循环几次：建议用While循环。实际上for和while都可以实现同样的目的。
*/

public class StructureWhile {

    public static void main(String[] args) {
        // 珠穆朗玛峰案例：纸折叠多少次后达到珠穆朗玛峰高度
        double PeakHeight = 8848860; // 珠穆朗玛峰的高度
        double PaperThickness = 0.1; // 纸张的厚度
        int count = 0; // 折叠的次数
        while (PaperThickness <= PeakHeight) {
            PaperThickness *= 2;
            count++;
        }
        System.out.println("纸张折叠"+count+"次后，纸张的高度为："+PaperThickness+",达到了珠峰的高度！");
    }
}
