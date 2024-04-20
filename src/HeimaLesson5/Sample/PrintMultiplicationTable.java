package HeimaLesson5.Sample;

public class PrintMultiplicationTable {
    /*打印乘法表*/
    public static void main(String[] args) {
        PrintLines(1,9);
    }

    public static void PrintLines(int start, int end){
        for (int i = start; i <= end ; i++) {
            PrintLine(i);
        }
    }

    public static void PrintLine(int line){
        for (int i = 1; i <= line ; i++) {
            System.out.print(i+"×"+line+"="+i*line);
            System.out.print(i==line? "\n" : "\t");
        }
    }

}
