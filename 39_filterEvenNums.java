import java.util.*;
import java.util.stream.*;

public class Practice {
    public static void main(String[] args) {
        // create a list of integers
        List<Integer> nums = List.of(1, 2, 3, 4, 5, 6);

        // create a List of integers called "even" & set it to equal nums.stream()
        List<Integer> even = nums.stream()
                // apply the filter method, and only return even numbers
                .filter(number -> number % 2 == 0)
                // collect your data into a list
                .collect(Collectors.toList());
        // print out even
        System.out.println("even numbers: " + even);
    }
}
