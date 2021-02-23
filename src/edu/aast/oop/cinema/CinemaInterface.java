package edu.aast.oop.cinema;

public interface CinemaInterface {

    String displayCurrentMoviesInTheatres();

    String displaySnacks();

    void addMovie(String name, String genre, String country, int duration);

    void addSnack(String name, String type, double price);

    void assignMovieToTheatre(String movieName, int TheatreId);

    String buyTickets(String movieName, int ticketsCount, String ticketType);

    String buySnacks(String snackName, int snackCount);

}
