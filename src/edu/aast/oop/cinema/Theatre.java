package edu.aast.oop.cinema;

public class Theatre {
    private int id;
    private String name;
    private Person employee;
    private Movie currentMovie;
    private Seat[] seats;

    public Theatre(int id, String name, Seat[] seats, Person employee){
        this.id = id;
        this.name = name;
        this.seats = seats;
        this.employee = employee;
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

    public Movie getCurrentMovie() {
        return currentMovie;
    }

    public void setCurrentMovie(Movie currentMovie) {
        this.currentMovie = currentMovie;
    }

    public Seat[] getSeats() {
        return seats;
    }

    public void setSeats(Seat[] seats) {
        this.seats = seats;
    }

    public Person getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }
}
