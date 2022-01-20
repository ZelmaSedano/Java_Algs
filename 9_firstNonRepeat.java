import java.util.stream.*;
import java.util.Map.Entry;
import java.util.*;

public class Practice {
    public static char firstNonRepeat(String str) {
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
                break;
            }
        }
        return ' ';

    }

    public static void main(String[] args) {
        Practice p = new Practice();
        System.out.println(p.firstNonRepeat("hite"));

    }
}
