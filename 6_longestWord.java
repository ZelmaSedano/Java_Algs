// create a method that sorts a given array
import java.util.Arrays;  // - import Array utils library to use .sort()

public class Practice {
    // create a method that finds the longest word in a string
    void longestWord(String str) {
        // split the string into a collection of words
        String[] words = str.split(" ");
        String longest = ""; // create variable to hold longest word

        // loop through the array of words
        for(int i = 0; i < words.length; i++) {
            if(words[i].length() > longest.length()) {
                longest = words[i];
            }
        }
        System.out.println("Longest word: " + longest);
    }

	public static void main(String[] args) {
		Practice p = new Practice();

        String myStr = "hi there";
        p.longestWord(myStr);
	} // end of main method

} // end of class
