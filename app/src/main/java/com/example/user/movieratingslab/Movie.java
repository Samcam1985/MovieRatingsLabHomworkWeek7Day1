package com.example.user.movieratingslab;

/**
 * Created by user on 03/07/2017.
 */


public class Movie {
    private String title;
    private String genre;
    private int currentRanking;

    public Movie(String title, String genre, int currentRanking) {
        this.title = title;
        this.genre = genre;
        this.currentRanking = currentRanking;
    }
    public String getTitle() {
        return this.title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
//
    public String getGenre() {
        return this.genre;
    }
//
    public void setGenre(String genre) {
        this.genre = genre;

    }
//
    public int getCurrentRanking() {
        return this.currentRanking;
    }

    public void setCurrentRanking(int currentRanking) {
        this.currentRanking = currentRanking;
//
    }
    @Override
    public String toString(){

    }
}










