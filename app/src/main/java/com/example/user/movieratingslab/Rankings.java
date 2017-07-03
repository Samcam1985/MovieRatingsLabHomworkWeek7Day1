package com.example.user.movieratingslab;
import java.util.ArrayList;

import static java.lang.System.in;

/**
 * Created by user on 03/07/2017.
 */

public class Rankings {
    public ArrayList<Movie> movies;

    public Rankings()
    {
        this.movies = new ArrayList<Movie>();
        this.setUpMovies();

    }

    private void setUpMovies() {
        Movie[] moviesToAdd = {
                new Movie("The Godfather", "Drama", 1),
                new Movie("The Shawshank Redemption", "Drama", 2),
                new Movie("Forrest Gump", "Drama", 3),
                new Movie("The Dark Knight", "Action", 4),
                new Movie("Lord of the Rings", "Fantasy", 5),
                new Movie("Star Wars", "Sci-fi", 6),
                new Movie("Pulp Fiction", "Crime", 7),
                new Movie("Titanic", "Romance", 8),
                new Movie("Saving Private Ryan", "War", 9),
                new Movie("Alien", "Horror", 10),
        };

        for (Movie movie : moviesToAdd) {
            this.movies.add(movie);


        }
    }


    public Movie getMovieByRanking(int currentRanking) {
        for(Movie movie : movies) {
            if(movie.getCurrentRanking() == currentRanking) {
                return movie;
            }
        }

        return null;
    }

    public void replaceEndMovie() {
        Movie movie = new Movie("Predator", "Horror", 10);
        this.movies.set(9, movie);
    }
}
