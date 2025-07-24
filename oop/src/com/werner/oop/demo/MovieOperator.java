package com.werner.oop.demo;

public class MovieOperator {
    private movie[] movies;
    public MovieOperator(movie[] movies) {
        this.movies = movies;
    }

    public void printAllMovies() {
        System.out.println("--------------");
        for (int i = 0; i < movies.length; i++) {
            movie m = movies[i];
            System.out.println("编号" + m.getId());
            System.out.println("名称" + m.getName());
            System.out.println("价格" + m.getPrice());
            System.out.println("__________");
        }
    }

    public void searchmovieById(int id) {
        for (int i = 0; i < movies.length; i++) {
            movie m = movies[i];
            if (movies[i].getId() == id) {
                System.out.println("该电影详细如下：");
                System.out.println("编号" + m.getId());
                System.out.println("名称" + m.getName());
                System.out.println("价格" + m.getPrice());
                System.out.println("得分" + m.getDirector());
                return;
            }
        }
    System.out.println("NOINFO");
    }
}
