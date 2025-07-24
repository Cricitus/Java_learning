package com.werner.oop.demo;

public class test {
    public static void main(String[] args) {
        movie[] movie = new movie[3];
        movie[0] = new movie( 1, "水门桥", 38.9, "王棋锐", "王棋锐", 30, "无人在意");
        movie[1] = new movie(2, "tu门桥", 34.9, "tu棋锐", "王棋锐", 32, "无人在意");
        movie[2] = new movie(3, "huo门桥", 33.9, "huo棋锐", "王棋锐", 33, "无人在意");

        MovieOperator operator = new MovieOperator(movie);
        operator.printAllMovies();
        operator.searchmovieById(2);
    }
}
