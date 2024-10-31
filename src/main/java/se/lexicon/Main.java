package se.lexicon;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        Book book1 = new Book("red", "JK");
        Book book2 = new Book("blue", "FH");
        System.out.println(book1.getBookInformation());
        System.out.println(book2.getBookInformation());


    }
}