import java.util.stream.*;
// you need the util library b/c you are using Arrays
import java.util.*;

public class Practice {
    public static void main(String[] args) {
        // pass in an Array of ints directly into Arrays.stream method
        Arrays.stream(new int[] { 2, 4, 6, 8, 10 })
                .map(x -> x * x)
                .average()
                .ifPresent(System.out::println);
    }
}
