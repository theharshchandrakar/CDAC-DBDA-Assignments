package com.assignment.assignment5;

import java.util.Set;

public class Song {
    private int serialno;
    private String title;
    private Set<String> artists;
    private int releaseYear;
    private double rating;

    public Song(int serialno, String title, Set<String> artists, int releaseYear, double rating) {
        this.serialno = serialno;
        this.title = title;
        this.artists = artists;
        this.releaseYear = releaseYear;
        this.rating = rating;
    }

    public int getSerialno() {
        return serialno;
    }

    public String getTitle() {
        return title;
    }

    public Set<String> getArtists() {
        return artists;
    }

    public int getReleaseYear() {
        return releaseYear;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    @Override
    public String toString() {
        return "Song " + serialno + ": '" + title + "' by " + artists
                + " | Year: " + releaseYear + " | Rating: " + rating + "/5.0";
    }
}
