import java.util.*; // imports Arrays
import java.util.stream.*;

public class Practice {
    public String longestWord(String str) {
        // if the string is empty, return 'please enter valid string'
        if (str.length() == 0) {
            return "please enter a valid string";
        }

        // create a variable to hold longest & split the string into words
        String longest = "";
        String[] words = str.trim().split(" ");

        for (int i = 0; i < words.length; i++) {
            if (words[i].length() > longest.length()) {
                longest = words[i];
            }
        }

        return longest;
    }

    public static void main(String[] args) {
        Practice p = new Practice();
        System.out.println(p.longestWord("this is a sentence"));
    }
}
