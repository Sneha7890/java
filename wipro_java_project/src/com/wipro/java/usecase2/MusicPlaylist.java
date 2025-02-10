package com.wipro.java.usecase2;
/*
 * Muslicplaylist to display the songs
 * sorting the id, title
 */
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

//Base class song
class Song {
    private int id;
    private String title;
    private String artist;
    private double duration; // in minutes
    private String genre; // New field for music type

    // Constructor to initialize object attributes
    public Song(int id, String title, String artist, double duration, String genre) {
        this.id = id;
        this.title = title;
        this.artist = artist;
        this.duration = duration;
        this.genre = genre;
    }

    // Getters
    public int getId() { return id; }
    public String getTitle() { return title; }
    public String getArtist() { return artist; }
    public double getDuration() { return duration; }
    public String getGenre() { return genre; }
    // I have not added the setter methods because song class attributes is fixed.
    
    // Display Song details
    public void displayDetails() {
        System.out.println("ID: " + id + ", Title: " + title + ", Artist: " + artist +
                ", Genre: " + genre + ", Duration: " + duration + " min");
    }
}

// Derived class (Inheritance)
class Podcast extends Song {
    private String host;

    // Constructor
    public Podcast(int id, String title, String artist, double duration, String genre, String host) {
        super(id, title, artist, duration, genre); //calls the parent class song
        this.host = host;
    }

    // Overriding displayDetails method (Polymorphism)
    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Hosted by: " + host);
    }
}

//  Main class
public class MusicPlaylist {
    public static void main(String[] args) {
        //  Using ArrayList (Collections)
        List<Song> playlist = new ArrayList<>();

        // Adding Songs & Podcasts
        playlist.add(new Song(105, "New York", "A.R. Rahman", 5.2, "Melody"));
        playlist.add(new Song(101, "Shape of You", "Ed Sheeran", 3.5, "Pop"));
        playlist.add(new Song(102, "I was never there", "The Weeknd", 4.01, "R&B"));
        playlist.add(new Song(103, "Art Deco", "Lana Del Rey", 4.1, "Jazz"));
        playlist.add(new Song(104, "I can't get enough", "Selena Gomez", 3.2, "Pop"));
        playlist.add(new Song(106, "Peaches", "Justin Bieber", 3.4, "R&B"));
        playlist.add(new Song(107, "He knows", "Camila Cabello", 3.9, "Latin Pop"));
        playlist.add(new Podcast(108, "Tech Talk", "NPR", 15.0, "Talk Show", "John Doe"));
        playlist.add(new Podcast(109, "Mindfulness Meditation", "Calm", 12.5, "Self-Help", "Sarah Lee"));

        //  Print the playlist before sorting
        System.out.println("\n Current Playlist:");
        playlist.forEach(Song::displayDetails); // Using for each loop

        //  User input for sorting
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("\nChoose sorting order: \n1. Sort by ID \n2. Sort by Title");
        int choice = scanner.nextInt();
        scanner.close();

        //  Sorting using Switch Case
        List<Song> sortedPlaylist;
        switch (choice) {
            case 1:
                sortedPlaylist = playlist.stream()
                        .sorted((s1, s2) -> Integer.compare(s1.getId(), s2.getId()))
                        .collect(Collectors.toList());
                System.out.println("\n Sorted by ID:");
                break;
            case 2:
                sortedPlaylist = playlist.stream()
                        .sorted((s1, s2) -> s1.getTitle().compareToIgnoreCase(s2.getTitle()))
                        .collect(Collectors.toList());
                System.out.println("\n Sorted by Title:");
                break;
            default:
                System.out.println("\n Invalid choice! Defaulting to Sort by ID.");
                sortedPlaylist = playlist.stream()
                        .sorted((s1, s2) -> Integer.compare(s1.getId(), s2.getId()))
                        .collect(Collectors.toList());
        }

        //  Display sorted songs
        sortedPlaylist.forEach(Song::displayDetails);
    }
}
