import java.util.*;

public class Practice {
    // create a method that returns the number of words in a string
    // hint: you will split the string into a collection of words (Array) & return
    // length
    public int wordCount(String str) { // takes a string as an argument
        // split the string into a collection of words & save in array called "words"
        String[] words = str.trim().split(" ");

        return words.length;
    }

    // main method where new Objects are created & methods are called
    public static void main(String[] args) {
        Practice p = new Practice();

        System.out.println(p.wordCount("hi there yo there ya da"));
    }
}
