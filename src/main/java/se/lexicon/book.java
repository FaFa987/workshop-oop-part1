package se.lexicon;

public class book {

    private String id;
    private String title;
    private String author;
    private boolean available;

    public book(String title, String author) {
        this.title = title;
        this.author = author;
    }
    public book(String title, String author, boolean available) {
        this.title = title;
        this.author = author;
        this.available = available;
        this.available = true;
    }
    public String getBookInformation() {
        return id;

    }


}
