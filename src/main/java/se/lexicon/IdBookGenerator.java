package se.lexicon;

public class IdBookGenerator {
    private static int id = 1000;

    public static String nextId(){
        ++id;
        return "BOOK-" + id;
    }

}
