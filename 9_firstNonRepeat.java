import java.util.*; // imports Arrays
import java.util.Map.Entry; // imports Map.Entry
import java.util.stream.*;

public class Practice {
    // create a method that finds the first non-repeating character in a string
    public void firstNonRepeat(String str) {
        // create a LinkedHashMap & make it the length of str
        Map<Character, Integer> counts = new LinkedHashMap<>(str.length());

        for (char c : str.toCharArray()) {
            // ternary operator
            // variable = c (cuz we're adding it anyway), conditional ? falseValue :
            // trueValue
            // if conditional is false, falseValue wins; if true, trueValue wins
            counts.put(c, counts.containsKey(c) ? counts.get(c) + 1 : 1);
        }

        for (Entry<Character, Integer> entry : counts.entrySet()) {
            if (entry.getValue() == 1) {
                System.out.println(entry.getKey());
                return; // keeps it from continuing to loop & return more
            }
        }
    }

    public static void main(String[] args) {
        Practice p = new Practice();
        p.firstNonRepeat("hi there");
    }
}
