package com.assignment.assignment5;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        MusicLibrary library = new MusicLibrary();

        System.out.println(" 1. Adding, Updating, and Removing Songs ");
        library.addSong(new Song(202, "Tujhe Dekha Toh", new HashSet<>(Arrays.asList("Lata Mangeshkar", "Kumar Sanu")), 1995, 4.8));
        library.addSong(new Song(203, "Kal Ho Naa Ho", new HashSet<>(Arrays.asList("Sonu Nigam")), 2003, 5.0));
        library.addSong(new Song(206, "Kesariya", new HashSet<>(Arrays.asList("Arijit Singh")), 2022, 4.5));
        library.addSong(new Song(207, "Naya Safar", new HashSet<>(Arrays.asList("Jubin Nautiyal")), 2025, 4.4));

        System.out.println("\n--- Initial Library ---");
        library.displayAllSongs();
        library.updateSongRating(206, 4.7);					 // Update rating 
        library.removeSong(202); 							 // Remove Song
        System.out.println("\n--- Library After Changes ---");
        library.displayAllSongs();
        System.out.println("");

        System.out.println("2. Songs Sorted by Title ");
        List<Song> sortedSongs = library.getSongsSortedByTitle();
        for (Song song : sortedSongs) {
            System.out.println(song);
        }
        System.out.println("");

        System.out.println("3. Search for a Song by Title ");
        String searchTitle = "Kabira";
        Song foundSong = library.searchByTitle(searchTitle);
        if (foundSong != null) {
            System.out.println("Found: " + foundSong);
        } else {
            System.out.println("Song '" + searchTitle + "' not found.");
        }
        System.out.println("");

        System.out.println("4. Songs Released in Current Year (2025) ");
        List<Song> currentYearSongs = library.getSongsFromCurrentYear();
        for (Song song : currentYearSongs) {
            System.out.println(song);
        }
        System.out.println("");

        System.out.println("5. Songs by Artist 'Arijit Singh' ");
        List<Song> artistSongs = library.getSongsByArtist("Arijit Singh");
        for (Song song : artistSongs) {
            System.out.println(song);
        }
        System.out.println("");

        System.out.println("6. Title and Release Year Listing ");
        library.displayTitleAndYear();
        System.out.println("\n");
        
        System.out.println("7. Lowest and Highest Rated Songs ");
        library.displayMinMaxRatedSongs();
        System.out.println("\n");
    }
}