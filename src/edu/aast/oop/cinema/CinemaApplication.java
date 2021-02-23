package edu.aast.oop.cinema;

import java.util.Scanner;

public class CinemaApplication {


    public static void main(String[] args) {


        final String CINEMA_NAME = "VOX";
        /** we assume that we have only 4 theatres with each having only 4 seats*/


        Person emp1 = new Employee("Youssef", 1);
        Person emp2 = new Employee("Jamal", 2);

        Seat seatA1 = new Seat("A", 1);
        Seat seatA2 = new Seat("A", 2);
        Seat seatB1 = new Seat("B", 1);
        Seat seatB2 = new Seat("B", 2);

        Seat[] seats = new Seat[4];
        seats[0] = seatA1;
        seats[1] = seatA2;
        seats[2] = seatB1;
        seats[3] = seatB2;

        Theatre theatre1 = new Theatre(1, "T1", seats, emp1);
        Theatre theatre2 = new Theatre(2, "T2", seats, emp1);
        Theatre theatre3 = new Theatre(3, "T3", seats, emp2) ;
        Theatre theatre4 = new Theatre(4, "T4", seats, emp2);

        Theatre[] theatres = new Theatre[4];
        theatres[0] = theatre1;
        theatres[1] = theatre2;
        theatres[2] = theatre3;
        theatres[3] = theatre4;


        CinemaImpl cinema = CinemaImpl.getInstance(CINEMA_NAME, theatres);

        /** This following statement will return the same CinemaImpl instance and will not create a new instance*/
        cinema = CinemaImpl.getInstance(CINEMA_NAME, theatres);

        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to " + CINEMA_NAME + " App!");

        System.out.println("Current Employee:");
        emp1.showPersonInfo();
        emp2.showPersonInfo();

        while (true) {
            System.out.println();
            System.out.println("********************************** Please Select an Option **********************************");
            System.out.println("1: You are an employee..");
            System.out.println("2: You a movie goer.");
            System.out.println("3: Quit."); //done

            int option = scanner.nextInt();

            System.out.println("Entered option is: " + option);

            if (option == 1) //employee
            {
                while (true) {
                    boolean goBack = false;
                    System.out.println();
                    System.out.println("********************************** Please Select an Option **********************************");
                    System.out.println("1: Display movies.");
                    System.out.println("2: Display snacks.");
                    System.out.println("3: Add a movie.");
                    System.out.println("4: Add a snack.");
                    System.out.println("5: Assign a movie to a theatre.");
                    System.out.println("6: Go back to previous menu.");

                    option = scanner.nextInt();

                    System.out.println("Entered option is: " + option);

                    switch (option) {
                        case 1:
                            String result = cinema.displayCurrentMoviesInTheatres();
                            System.out.println(result);
                            break;
                        case 2:
                            result = cinema.displaySnacks();
                            System.out.println(result);
                            break;
                        case 3:
                            System.out.println("enter movie details in this format: \"name,genre,country,duration\"");
                            String movie = scanner.next();
                            String[] movieDetails = movie.split(",");

                            cinema.addMovie(movieDetails[0]
                                , movieDetails[1]
                                , movieDetails[2]
                                , Integer.parseInt(movieDetails[3]));

                            break;
                        case 4:
                            System.out.println("enter snack details in this format: \"name,type,price\"");
                            String snack = scanner.next();
                            String[] snackDetails = snack.split(",");

                            cinema.addSnack(snackDetails[0]
                                , snackDetails[1]
                                , Double.parseDouble(snackDetails[2]));

                            break;

                        case 5:
                            System.out.println("enter movie name and theatre id in this format: \"name,id\"");
                            String input = scanner.next();
                            String[] arr = input.split(",");

                            cinema.assignMovieToTheatre(arr[0], Integer.parseInt(arr[1]));
                            break;

                        case 6:
                            goBack = true;
                            break;
                        default:
                            System.out.println("Please enter a valid option");
                    }

                    if (goBack) break;
                }

            } else if (option == 2) // movie goer
            {

                while (true) {
                    boolean goBack = false;

                    System.out.println();
                    System.out.println("********************************** Please Select an Option **********************************");
                    System.out.println("1: Display movies.");
                    System.out.println("2: Display snacks.");
                    System.out.println("3: Buy  movie tickets."); //TODO
                    System.out.println("4: Buy  snacks"); // TODO
                    System.out.println("5: Quit.");

                    option = scanner.nextInt();

                    System.out.println("Entered option is: " + option);

                    switch (option) {
                        case 1:
                            String result = cinema.displayCurrentMoviesInTheatres();
                            System.out.println(result);
                            break;
                        case 2:
                            result = cinema.displaySnacks();
                            System.out.println(result);
                            break;
                        case 3:
                            System.out.println("enter movie name and tickets count and type in this format: " +
                                                   "\"name,count,type\"");
                            String movie = scanner.next();
                            String[] ticketsDetails = movie.split(",");

                             result = cinema.buyTickets(ticketsDetails[0]
                                ,Integer.parseInt(ticketsDetails[1])
                                , ticketsDetails[2]);
                            System.out.println(result);

                            break;
                        case 4:
                            System.out.println("enter snack name and count in this format: " +
                                                   "\"name,count\"");
                            String snack = scanner.next();
                            String[] snackDetails = snack.split(",");

                            result = cinema.buySnacks(snackDetails[0]
                                ,Integer.parseInt(snackDetails[1]));
                            System.out.println(result);

                            break;

                        case 5:
                            goBack = true;
                            break;
                        default:
                            System.out.println("Please enter a valid option");
                    }

                    if (goBack) break;

                }


            } else if (option == 3) {
                break;
            } else {
                System.out.println("Please enter a valid option");
            }
        }

        System.out.println("Thank you for using " + CINEMA_NAME + " App. Hope to see you again soon!");

    }

}
