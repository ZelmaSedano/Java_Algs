import java.util.*; // imports Arrays
import java.util.stream.*;

public class Practice {
    public int wordCount(String str) {
        if (str.length() == 0) {
            return -1;
        }
        String[] words = str.trim().split(" ");
        return words.length;
    }

    public static void main(String[] args) {
        Practice p = new Practice();
        System.out.println(p.wordCount("hi there"));
    }
}
