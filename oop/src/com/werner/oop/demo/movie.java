package com.werner.oop.demo;

public class movie {
    private int id;
    private String name;
    private double score;
    private String director;
    private String actor;
    private double price;
    private String info;

    public movie() {
    }

    public movie(int id, String name, double score, String director, String actor, double price, String info) {
        this.id = id;
        this.name = name;
        this.score = score;
        this.director = director;
        this.actor = actor;
        this.price = price;
        this.info = info;
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public double getScore() {
        return score;
    }
    public void setScore(double score) {
        this.score = score;
    }
    public String getDirector() {
        return director;
    }
    public void setDirector(String director) {
        this.director = director;
    }
    public String getActor() {
        return actor;
    }
    public void setActor(String actor) {
        this.actor = actor;
    }
    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    public String getInfo() {
        return info;
    }
    public void setInfo(String info) {
        this.info = info;
    }
}
