import java.util.stream.*;
import java.util.*;

public class Practice {

    public static void main(String[] args) {
        // Create a List of Integers
        List<Integer> nums = List.of(1, 2, 3, 4, 5);

        // create a variable called sum that saves the result of the stream
        int sum = nums.stream() // this converts it into a stream
                .reduce(0, (a, b) -> a + b);

        System.out.println(sum);
    }
}
