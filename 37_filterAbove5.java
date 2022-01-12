import java.util.*; // imports Arrays
import java.util.stream.*;

public class Practice {
    public static void main(String[] args) {
        // create a List of integers
        List<Integer> nums = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9);

        // make a variable called result & set its valie to list.stream()
        List<Integer> result = nums.stream()
                .filter(x -> x > 5)
                .collect(Collectors.toList());

        System.out.println(result);

    }
}
