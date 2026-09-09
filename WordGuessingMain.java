public class WordGuessingMain{
    public static void main(String[] args){
        WordGuessing w = new WordGuessing("witch");
        w.update("t");
        System.out.println(w.getUserString());
        w.update("i");
        System.out.println(w.getUserString());
        w.update("w");
        System.out.println(w.getUserString());
        w.update("c");
        System.out.println(w.getUserString());
        w.update("h");
        System.out.println(w.getUserString());
    }
}