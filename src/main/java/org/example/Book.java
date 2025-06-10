package org.example;

public class Book extends LibraryItem {
    // subclass fields
    protected int pageCount;

    // subclass constructor
    public Book(String title, String author, int year, int pageCount) {
        super(title, author, year);
        this.pageCount = pageCount;
    }

    // getters & methods
    public int getPageCount() {
        return pageCount;
    }

    public void readBook() {
        System.out.println("Reading " + this.title + " by " + this.author + "...");
        System.out.println("Done!");
    }

    // override base class toString
    @Override
    public String toString() {
        return "Book: " + title + " by " + author + " (" + year + ") - " + pageCount + " pages";
    }
}
