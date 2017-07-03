package com.example.user.movieratingslab;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Created by user on 03/07/2017.
 */

public class MovieTest {
    Movie movie;

    @Before
    public void before() {
        movie = new Movie("The Godfather", "Drama", 1 );
    }

    @Test
    public void getTitle() {
        assertEquals("The Godfather", movie.getTitle());
    }

    @Test
    public void setTitle() {
        movie.setTitle("Star Wars");
        assertEquals("Star Wars", movie.getTitle());

    }

    @Test
    public void getGenre() {
        assertEquals("Drama", movie.getGenre());

    }

    @Test
    public void setGenre() {
        movie.setGenre("Comedy");
        assertEquals("Comedy", movie.getGenre());
    }

    @Test
    public void getCurrentRanking() {
        assertEquals(1, movie.getCurrentRanking());
    }

    @Test
    public void setCurrentRating() {
        movie.setCurrentRanking(4);
        assertEquals(4, movie.getCurrentRanking());
    }
}
