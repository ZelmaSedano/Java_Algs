import java.util.stream.*;
// you need the util library b/c you are using Arrays
import java.util.*;

public class Practice {
    public static void main(String[] args) {
        // Stream from Array, sort, filter & print
        String[] names = { "Al", "Ankit", "Kushal", "Shivika", "Sarah" };
        Arrays.stream(names)
                // filters names that start with "S"
                .sorted()
                .forEach(System.out::println);
    }
}
