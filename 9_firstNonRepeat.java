
// import the util library to use HashMap
import java.util.*;

class Practice {
    // create a method that returns the first non-repeating character in a string
    public char firstNonRepeating(String str) {
        // take care of edge cases, if length is 0 return -1
        if (str.length() == 0) {
            // since it's a char method, we HAVE to return char
            return '0';
        }

        // create a HashMap that has Character as key & Integer as Value
        HashMap<Character, Integer> characterCount = new HashMap<>();

        // using an enhanced for loop: convert strint into array of chars
        for (char c : str.toCharArray()) {
            // if HashMap characterCount DOESN'T contain key (c)
            if (!characterCount.containsKey(c)) {
                // then add key c w/ value of 1
                characterCount.put(c, 1);
            } else {
                // add c and add its former value (acquired using .get()) + 1
                characterCount.put(c, characterCount.get(c) + 1);
            }
        }

        // loop through the HashMap again and check to see if one of c's values is 1
        for (char c : str.toCharArray()) {
            // if it their is a character w/ 1 as value, return that character
            if (characterCount.get(c) == 1) {
                return c;
            }
        }

        // as a backup, return nothing
        return '0';
    }

    public static void main(String[] args) {
        Practice p = new Practice();
        System.out.println(p.firstNonRepeating("yola"));
    }
}
