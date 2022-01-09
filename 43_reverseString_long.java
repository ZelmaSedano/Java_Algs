import java.util.stream.*;
import java.util.*; // imports List

public class Practice {
    // create a method that reverses a given string
    public String reverseString(String str) {
        String reversed = new StringBuilder(str).reverse().toString();
        return reversed;
    }

    public static void main(String[] args) {
        Practice p = new Practice();

        System.out.println(p.reverseString("hi"));
    }
}
