package HeimaLesson5.Sample;

public class FindPrimeNum {
    /*找素数：
    1.查找1~该值内的所有素数
    2.某个数均不能被2~其一半值整除，则为素数
    * */
    public static void main(String[] args) {
        SearchPrimeNum(1,2);
    }

    public static void SearchPrimeNum(int start , int end){
        System.out.println(start + "~" + end + "之间的素数包括：");
        for (int i = start; i <= end; i++) {
            if (IsPrimeNum(i)){
                System.out.println(i);
            }
        }
    }

    public static boolean IsPrimeNum(int Num){
        if (Num < 2){
            return false;
        }
        for (int i = 2; i <= Num / 2 ; i++) {
            if (Num % i == 0){
                return false;
            }
        }
        return true;
    }


    
}
