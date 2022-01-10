import java.util.stream.*;
import java.util.*; // imports Arrays

public class Practice {

    public static void main(String[] args) {
        // pass in an Array of ints directly into Arrays.stream method
        Arrays.stream(new int[] { 2, 4, 6, 8, 10 })
                .average()
                .ifPresent(System.out::println);
    }
}
