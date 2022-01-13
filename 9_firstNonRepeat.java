import java.util.stream.*;
import java.util.*;
import java.util.Map.Entry;

public class Practice {
    // make a method that returns the first letter that's not repeated in the String
    public void firstNonRepeat(String str) {
        if (str.length() == 0) {
            System.out.println("please enter a valid string");
        }

        // make a LinkedHashMap
        Map<Character, Integer> charCount = new LinkedHashMap<>(str.length());

        // convert the string to an Array of chars & loop through it
        for (char c : str.toCharArray()) {
            charCount.put(c, charCount.containsKey(c) ? charCount.get(c) + 1 : 1);
        }

        // loop through the map using Entry<Character,Integer> & call each element
        // "entry"
        // convert the map to an entrySet
        for (Entry<Character, Integer> entry : charCount.entrySet()) {
            if (entry.getValue() == 1) {
                System.out.println(entry.getKey());
                return; // to stop it from returning more than 1 result
            }
        }

    }

    public static void main(String[] args) {
        Practice p = new Practice();
        p.firstNonRepeat("hi there");
    }
}
