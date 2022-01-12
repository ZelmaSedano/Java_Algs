import java.util.*; // import List
import java.util.stream.*;

public class Practice {
    public static void main(String[] args) {
        // create a List of integers
        List<Integer> nums = List.of(1, 2, 3, 4, 5, 6);

        // create a variable that's a list & set it to nums.stream()
        List<Integer> squares = nums.stream()
                // apply .map to square each element, then collect into List
                .map(x -> x * x)
                .collect(Collectors.toList());

        System.out.println(squares);

    }
}
