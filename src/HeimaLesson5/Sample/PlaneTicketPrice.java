package HeimaLesson5.Sample;

public class PlaneTicketPrice {
    enum Type {头等舱 , 经济舱};

    public static void main(String[] args) {
        /*计算并输出飞机票的价格，规则如下：
        1.5~10月为旺季，头等舱9折，经济舱8.5折
        2.11~4月为淡季，头等舱7折，经济舱6.5折
        * */
        System.out.println(PriceCalculator(1000, 8, Type.经济舱));

    }

    public static double PriceCalculator(double price ,int month , Type type){
        double discount = 1;
        if (month >= 5 && month <= 10) {
            switch (type) {
                case 头等舱 -> discount = 0.9;
                case 经济舱 -> discount = 0.85;
            }
        }
        else {
            switch (type) {
                case 头等舱 -> discount = 0.7;
                case 经济舱 -> discount = 0.65;
            }
        }
        return price*discount;
    }
}
