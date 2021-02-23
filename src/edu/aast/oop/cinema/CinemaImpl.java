package edu.aast.oop.cinema;

public class CinemaImpl implements CinemaInterface {

    // static variable single_instance of type CinemaImpl
    private static CinemaImpl single_instance = null;


    private String name;
    private Theatre[] theatres;

    private Movie[] movies = new Movie[100]; // max 100 movies
    int moviesIndex = 0;

    private Snack[] snacks = new Snack[100]; // max 100 snacks
    int snackIndex = 0;

    private CinemaImpl(String name, Theatre[] theatres) {
        this.name = name;
        this.theatres = theatres;
    }

    public static CinemaImpl getInstance(String name, Theatre[] theatres) {
        // To ensure only one instance is created
        if (single_instance == null) {
            single_instance = new CinemaImpl(name, theatres);
        }
        return single_instance;
    }


    public String displayCurrentMoviesInTheatres() {
        String result = "";

        for (Movie movie : movies) {
            if (movie == null) break; // empty slot in the array
            String moveiDetails =
                movie.getName() + " " + movie.getGenre() + " " + movie.getCountry() + " " + movie.getDuration() + " minutes\n";
            result += moveiDetails;
        }

        return result;

    }

    public String displaySnacks() {
        String result = "";

        for (Snack snack : snacks) {
            if (snack == null) break; // empty slot in the array
            String snackDetails =
                snack.getName() + " " + snack.getType() + " " + snack.getPrice() + " " + "pounds\n";
            result += snackDetails;
        }

        return result;    }

    public void addMovie(String name, String genre, String country, int duration) {

        movies[moviesIndex] = new Movie(name, genre, country, duration);
        moviesIndex++;

    }

    public void addSnack(String name, String type, double price) {
        snacks[snackIndex] = new Snack(name, type, price);
        snackIndex++;

    }

    public void assignMovieToTheatre(String movieName, int theatreId) {

        Movie currentMovie = null;
        for (Movie movie : movies) {
            if (movie != null && movie.getName().equalsIgnoreCase(movieName)) {
                currentMovie = movie;
                break;
            }
        }
        for (Theatre theatre : theatres) {
            if (theatre.getId() == theatreId) theatre.setCurrentMovie(currentMovie);
        }

    }

    public String buyTickets(String movieName, int ticketsCount, String ticketType) {

        /** for demo purpose always reserve the same ticket*/

        String result ="";
        for(int i =0; i < ticketsCount; i++){
            result+=  movieName+ " Theatre 1 Seat B" +i+  " Type "+ ticketType +"\n";
        }
        return result;
    }

    public String buySnacks(String snackName, int snackCount) {

        Snack currentSnack = null;
        for (Snack snack : snacks) {
            if (snack != null && snack.getName().equalsIgnoreCase(snackName)) {
                currentSnack = snack;
                break;
            }
        }

        String result ="";
        for(int i =0; i < snackCount; i++){
            result+=  snackName + " Type: "+ currentSnack.getType() +" Price: " +currentSnack.getPrice() +"\n";
        }
        result+=  "---------------------------------\n";
        result+=  " Total price: "+ currentSnack.getPrice() * snackCount +" pounds\n";
        return result;
    }
}
