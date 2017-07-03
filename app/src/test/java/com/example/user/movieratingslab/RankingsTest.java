package com.example.user.movieratingslab;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

/**
 * Created by user on 03/07/2017.
 */

public class RankingsTest {
    ArrayList<Movie> movies;
    private Rankings rankings;

    @Before
    public void before() {
        rankings = new Rankings();
    }

    @Test
    public void getMovieSpecificRanking() {
        assertEquals("Pulp Fiction", rankings.getMovieByRanking(7).getTitle());
    }

    @Test
    public void replaceEndMovie() {
        rankings.replaceEndMovie();
        assertEquals("Predator", rankings.movies.get(9).getTitle());

    }


    }