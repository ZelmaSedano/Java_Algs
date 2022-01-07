import java.util.stream.*;
// you need the util library b/c you are using Arrays
import java.util.*;

public class Practice {
    public static void main(String[] args) {
        List<String> people = Arrays.asList("Al", "Ankit", "Sarika", "Hans", "Eric");

        people
                // creates a stream based off the people
                .stream()
                .map(String::toLowerCase)
                .filter(x -> x.startsWith("a"))
                .forEach(System.out::println);
    }
}
