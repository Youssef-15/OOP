package edu.aast.oop.cinema;

public class Movie {

    private String name;
    private String genre;
    private String country;
    private int duration;

    public  Movie(String name, String genre, String country, int duration){
        this.name = name;
        this.genre = genre;
        this.country = country;
        this.duration = duration;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }
}
