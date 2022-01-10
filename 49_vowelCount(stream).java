import java.util.stream.*;
import java.util.*; // imports Arrays

public class Practice {
    public void vowelCount(String str) {
        List<String> vowels = Arrays.asList("a", "e", "i", "o", "u");

        // generate stream from an String[] of single character strings
        long count = Arrays.stream(str.split("")) 
                .filter(vowels::contains) // remove all non-vowels
                .count();

        System.out.println(count);
    }

    public static void main(String[] args) {
        Practice p = new Practice();

        p.vowelCount("hiii");
    }
}
