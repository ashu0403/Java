package com.jap;

public class Movie {
    private int movieId;
    private String movieName;
    private String genre;
    private String releaseDate;
    public String getMovieName() {
        return movieName;
    }
    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }
    public String getGenre() {
        return genre;
    }
    public void setGenre(String genre) {
        this.genre = genre;
    }
    public String getReleaseDate() {
        return releaseDate;
    }
    public void setReleaseDate(String releaseDate) {
        this.releaseDate = releaseDate;
    }
    public void setMovieId(int movieId) {
        this.movieId = movieId;
    }
    public int getMovieId() {
        return movieId;
    }
    public Movie(int movieId, String movieName, String genre, String releaseDate) {
        this.movieId = movieId;
        this.movieName = movieName;
        this.genre = genre;
        this.releaseDate = releaseDate;
    }

    // create getter and setter for all the above attributes


    //complete the parameterized constructor
   
}
