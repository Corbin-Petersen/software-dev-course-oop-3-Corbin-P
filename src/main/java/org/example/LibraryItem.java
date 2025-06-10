package org.example;

public class LibraryItem {
    // base class fields
    protected String title;
    protected int year;
    protected String author;

    // base class constructor
    public LibraryItem(String title, String author, int year) {
        this.title = title;
        this.year = year;
        this.author = author;
    }

    // getters
    public String getTitle() {
        return title;
    }
    public int getYear() {
        return year;
    }
    public String getAuthor() {
        return author;
    }

    // override Object toString
    @Override
    public String toString() {
        return "Item: " + title + " by " + author + " (" + year + ")";
    }
}
