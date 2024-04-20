package HeimaLesson5.Sample;

public class PrintTriangle {
    /*打印三角形*/
    public static void main(String[] args) {
        int all = 4;
        for (int i = 1; i <= all ; i++) {
            PrintLine(all, i);
            System.out.println();
        }
    }

    public static void PrintLine(int all,int line){
        for (int i = 1; i <= all-line; i++) {
            System.out.print(" ");
        }
        for (int i = 1; i <= (2*line-1) ; i++) {
            System.out.print(line==all || i==1 || i == (2*line-1) ? "*" : " ");
        }
    }

}
