import java.util.*;

class Practice {
    public char firstNonRepeatingCharacter(String s) {
        // edge cases
        if (s == null)
            return ' ';
        if (s.length() == 0)
            return ' ';

        // create a hash map, character = key, value = integer
        HashMap<Character, Integer> characterCount = new HashMap<>();

        // turn the string into an Array of chars & loop through it, call each char "c"
        for (char c : s.toCharArray()) {
            // characterCount is map
            // if char "c" isn't in hashmap, then add c to hashmap w/ 1 as the value
            if (!characterCount.containsKey(c)) {
                characterCount.put(c, 1);
                // if it IS in the counter, get the value for c and add c & its former value
                // incremented by 1 to HashMap
            } else {
                characterCount.put(c, characterCount.get(c) + 1);
            }
        }
        // loop through hashmap again and check to see if one of the c's value is 1
        for (char c : s.toCharArray()) {
            // if it their is a character w/ 1 as value, return that character
            if (characterCount.get(c) == 1) {
                return c;
            }
        }

        return ' ';
    }

    // main method
    public static void main(String[] args) {
        Practice p = new Practice();
        System.out.println(p.firstNonRepeatingCharacter("yyola"));
    }
}
