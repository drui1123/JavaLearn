package HeimaLesson2.Structure;

/*
掌握Switch的用法：
1.不支持double、float、long类型
2.case给出的值不允许重复，且不能是变量
3.缺少break时，具有穿透性
*/

public class StructureSwitch {
    public static void main(String[] args) {
        String day = "周日";
        switch (day){
            case "周一":
                System.out.println("今天吃鸡");
                break;
            case "周二":
            case "周三":
            case "周四":
                System.out.println("今天开会"); // 不写break时，向下具有穿透性，顺序执行到第一个break
                break;
            case "周五":
                System.out.println("今天回家");
                break;
            case "周六":
            case "周日":
                System.out.println("今天加班");
                break;
            default:
                System.out.println("您输入的星期不正确");
        }
        // double类型数据的计算不精确
        double b1=0.1;
        double b2=0.2;
        System.out.println(b1+b2);
    }
}
