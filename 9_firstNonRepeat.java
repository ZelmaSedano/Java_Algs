import java.util.*;

class Practice {
    public char firstNonRepeatingCharacter(String s) {
        // create a hash map
        HashMap<Character, Integer> characterCount = new HashMap<>();
        // Best to discuss it with interviewer, what should we return here?
        if (s == null)
            return ' ';
        if (s.length() == 0)
            return ' ';
        // turn the string into an Array of chars & loop through it, call each char "c"
        for (char c : s.toCharArray()) {
            // characterCount is map
            // if char "c" isn't in hashmap, then add c to hashmap w/ 1 as the value
            if (!characterCount.containsKey(c)) {
                characterCount.put(c, 1);
                // if it IS in the counter, add the character & increment its value by 1
            } else {
                characterCount.put(c, characterCount.get(c) + 1);
            }
        }
        // loop through hashmap again and check to see if one of the c's value is 1
        for (char c : s.toCharArray()) {
            // if it their is a character w/ 1 as value, return that character
            if (characterCount.get(c) == 1)
                return c;
        }

        return ' ';
    }

    // main method
    public static void main(String[] args) {
        Practice p = new Practice();
        System.out.println(p.firstNonRepeatingCharacter("yyola"));
    }
}
