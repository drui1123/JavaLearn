package HeimaLesson6.Oop.FilmSample;

public class FilmOperator {
    private Film[] films;

    public FilmOperator(Film[] films) {
        this.films = films;
    }

    //方法1：展示全部电影信息
    public void PrintAllFilms(){
        System.out.println("系统中的全部电影信息如下：");
        for (int i = 0; i < films.length; i++) {
            PrintFilm(films[i]);
            System.out.println("-------------------------");
        }
    }
    private void PrintFilm(Film film){
        System.out.println("编号：" + film.getId());
        System.out.println("名称：" + film.getName());
        System.out.println("价格：" + film.getPrice());
        System.out.println("评分：" + film.getScore());
        System.out.println("导演：" + film.getDirector());
        System.out.println("演员：" + film.getActor());
        System.out.println("信息：" + film.getInfo());
    }

    // 方法2：根据电影编号查询电影信息
    public void SearchFilm(int id){
        for (int i = 0; i < films.length; i++) {
            Film temp = films[i];
            if (temp.getId() == id){
                System.out.println("该电影详情如下：");
                PrintFilm(temp);
                return;
            }
        }
        System.out.println("没有该电影信息！");
    }

}