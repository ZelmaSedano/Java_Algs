import java.util.*;
import java.util.stream.*;

public class Practice {
    public static void main(String[] args) {
        // create a stream of an Array (Arrays)
        Arrays.stream(new int[] { 2, 4, 6, 8, 10 })
                // map over each element & square it
                .map(number -> number * number)
                // print out each element
                .forEach(number -> System.out.println(number));

    }
}
