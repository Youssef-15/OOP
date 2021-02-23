package edu.aast.oop.cinema;

public class Ticket {

    private int id;
    private String type;
    private Theatre theatre;
    private Seat seat;

    public Ticket(int id, String type, Theatre theatre, Seat seat) {
        this.id = id;
        this.type = type;
        this.theatre = theatre;
        this.seat = seat;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Theatre getTheatre() {
        return theatre;
    }

    public void setTheatre(Theatre theatre) {
        this.theatre = theatre;
    }

    public Seat getSeat() {
        return seat;
    }

    public void setSeat(Seat seat) {
        this.seat = seat;
    }
}
