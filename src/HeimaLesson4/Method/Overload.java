package HeimaLesson4.Method;

public class Overload {
    /*掌握方法重载：
    1.一个类中，多个方法的名称相同，但他们的形参不同则为方法重载
    2.形参不同包括形参的个数、类型、顺序不同，但是不关心形参的名称

    方法案例：开发武器系统，功能需求如下：
    1.默认发射一枚武器；
    2.指定地区发射一枚武器；
    3.指定地区发射多枚武器
    * */
    public static void main(String[] args) {
        fire();
        fire("米国");
        fire("米国",999);
    }

    public static void fire(){
        fire("岛国",1);
    }

    public static void fire(String country){
        fire(country,1);
    }

    public static void fire(String country, int number){
        System.out.println("向" + country + "发射了" + number + "枚武器！");
    }
}
