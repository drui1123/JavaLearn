package HeimaLesson2.Structure;

/*
掌握Switch的用法
*/

public class StructureSwitch {
    public static void main(String[] args) {
        String day = "周三";
        switch (day){
            case "周一":
                System.out.println("今天吃鸡");
                break;
            case "周二":
                System.out.println("");
                break;
            case "周三":
                System.out.println("");
                break;
            case "周四":
                System.out.println();
                break;
            case "周五":
                System.out.println();
                break;
            case "周六":
                System.out.println();
                break;
            case "周日":
                System.out.println();
                break;
            default:
                System.out.println("您输入的星期不正确");
        }
    }
}
