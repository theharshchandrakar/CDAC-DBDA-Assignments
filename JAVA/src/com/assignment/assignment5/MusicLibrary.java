package com.assignment.assignment5;

import java.util.*;

public class MusicLibrary {
    private Map<Integer, Song> songCollection = new HashMap<>();

    public void addSong(Song song) {
        songCollection.put(song.getSerialno(), song);
        System.out.println("Added: " + song.getTitle());
    }

    public void removeSong(int serialno) {
        if (songCollection.containsKey(serialno)) {
            Song removedSong = songCollection.remove(serialno);
            System.out.println("Removed: " + removedSong.getTitle());
        } else {
            System.out.println("Error: Song with serial number " + serialno + " not found.");
        }
    }

    public void updateSongRating(int serialno, double newRating) {
        Song songToUpdate = songCollection.get(serialno);
        if (songToUpdate != null) {
            songToUpdate.setRating(newRating);
            System.out.println("Updated rating for '" + songToUpdate.getTitle() + "' to " + newRating);
        } else {
            System.out.println("Error: Song with serial number " + serialno + " not found.");
        }
    }

    public void displayAllSongs() {
        if (songCollection.isEmpty()) {
            System.out.println("The music library is empty.");
            return;
        }
        for (Song song : songCollection.values()) {
            System.out.println(song);
        }
    }

    public List<Song> getSongsSortedByTitle() {
        List<Song> songList = new ArrayList<>(songCollection.values());
        Collections.sort(songList, new Comparator<Song>() {
            public int compare(Song s1, Song s2) {
                return s1.getTitle().compareTo(s2.getTitle());
            }
        });
        return songList;
    }

    public Song searchByTitle(String title) {
        for (Song song : songCollection.values()) {
            if (song.getTitle().equalsIgnoreCase(title)) {
                return song;
            }
        }
        return null;
    }

    public List<Song> getSongsFromCurrentYear() {
        List<Song> yearlySongs = new ArrayList<>();
        int currentYear = 2025;
        for (Song song : songCollection.values()) {
            if (song.getReleaseYear() == currentYear) {
                yearlySongs.add(song);
            }
        }
        return yearlySongs;
    }

    public List<Song> getSongsByArtist(String artistName) {
        List<Song> artistSongs = new ArrayList<>();
        for (Song song : songCollection.values()) {
            for (String artist : song.getArtists()) {
                if (artist.equalsIgnoreCase(artistName)) {
                    artistSongs.add(song);
                    break;
                }
            }
        }
        return artistSongs;
    }

    public void displayTitleAndYear() {
        System.out.println("--- Song Titles and Release Years ---");
        for (Song song : songCollection.values()) {
            System.out.println("'" + song.getTitle() + "' (" + song.getReleaseYear() + ")");
        }
    }

    public void displayMinMaxRatedSongs() {
        if (songCollection.isEmpty()) {
            System.out.println("The library is empty, cannot find ratings.");
            return;
        }
        Song lowestRatedSong = null;
        Song highestRatedSong = null;
        for (Song currentSong : songCollection.values()) {
            if (lowestRatedSong == null || currentSong.getRating() < lowestRatedSong.getRating()) {
                lowestRatedSong = currentSong;
            }
            if (highestRatedSong == null || currentSong.getRating() > highestRatedSong.getRating()) {
                highestRatedSong = currentSong;
            }
        }
        System.out.println("Lowest Rated Song ⭐️: " + lowestRatedSong);
        System.out.println("Highest Rated Song 🌟: " + highestRatedSong);
    }
}
