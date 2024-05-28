package HeimaLesson6.Oop.FilmSample;

import java.util.Scanner;

/*
设计一个电影系统：
1.创建一个电影对象实体类；
2.创建一个电影操作对象类；
3.准备全部电影信息
* */
public class FilmSample {
    public static void main(String[] args) {
        Film[] films = new Film[4];
        Film m1 = new Film(1,"水门桥",38.9,9.8,"徐克","吴京","12万人想看");
        Film m2 = new Film(2,"出拳吧",39,7.8,"唐晓白","田雨","3.5万人想看");
        Film m3 = new Film(3,"月球陨落",42,7.9,"罗兰","贝瑞","17.9万人想看");
        Film m4 = new Film(4,"一点就到家",35,8.7,"许宏宇","刘昊然","18.8万人想看");
        films[0] = m1;
        films[1] = m2;
        films[2] = m3;
        films[3] = m4;

        FilmOperator filmoperator = new FilmOperator(films);

        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("===电影信息系统===");
            System.out.println("输入数字1:查询全部电影信息");
            System.out.println("输入数字2:根据编号查询电影信息");
            int order = sc.nextInt();
            Input:
            switch (order){
                case 1:
                    filmoperator.PrintAllFilms();
                    break;
                case 2:
                    System.out.println("请输入电影编号：");
                    filmoperator.SearchFilm(sc.nextInt());
                    break;
                default:
                    System.out.println("您输入的指令有误！");
            }
        }

    }
}
