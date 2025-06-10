package org.example;

public class Album extends LibraryItem {
    // subclass fields
    protected int trackCount;

    // subclass constructor
    public Album(String title, String author, int year, int trackCount) {
        super(title, author, year);
        this.trackCount = trackCount;
    }

    // getter
    public int getTrackCount() {
        return trackCount;
    }

    // override base class toString
    @Override
    public String toString() {
        return "Album: " + title + " by " + author + " (" + year + ") - " + trackCount + " tracks";
    }
}
