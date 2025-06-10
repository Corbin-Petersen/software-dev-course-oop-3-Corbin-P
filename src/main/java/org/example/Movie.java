package org.example;

public class Movie extends LibraryItem {
    // subclass fields
    protected int durationInMinutes;

    // subclass constructor
    public Movie(String title, String author, int year, int durationInMinutes) {
        super(title, author, year);
        this.durationInMinutes = durationInMinutes;
    }

    // getter
    public int getDurationInMinutes() {
        return durationInMinutes;
    }

    // override base class toString
    @Override
    public String toString() {
        return "Movie: " + title + " by " + author + " (" + year + ") - " + durationInMinutes + " minutes";
    }
}
