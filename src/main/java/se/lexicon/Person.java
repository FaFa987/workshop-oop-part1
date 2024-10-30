package se.lexicon;

public class Person {

    private static int sequencer;
    private int id;
    private String firstName;
    private String lastName;

    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        sequencer++;
        this.id = sequencer;
    }
    private int getNextId() {
        return ++sequencer;
    }
    public String loanBook(book){
        return firstName + " " + lastName;
    }

    public String returnBook(book){
        return firstName + " " + lastName;
    }
    public String getPersonInformation(){
        return firstName + " " + lastName;
    }



}
