package se.lexicon;

public class Book {

    private String id;
    private String title;
    private String author;
    private boolean available;
    private Person borrower;

    public Book(String title, String author) {
        this.id = IdBookGenerator.nextId();
        this.title = title;
        this.author = author;
        this.setAvailable(true);

    }


    public Book(String title, String author, Person borrower) {
        this(title, author);
        this.borrower = borrower;
        this.setAvailable(false);

    }

    private void setAvailable(boolean available) {
        this.available = available;
    }

    public void setBorrower(Person borrower) {
        this.borrower = borrower;
    }

    public String getBookInformation() {
        return "Id: " + id + " Title: " + title + " Author: " + author + " Available: " + available + " borrower: " + borrower;

    }


}
