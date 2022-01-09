import java.util.stream.*;
import java.util.*; // imports List

public class Practice {
    public static void main(String[] args) {
        // create a List of integers & call it nums
        List<Integer> nums = List.of(1, 2, 3, 4, 5);

        int minimus = nums.stream()
                .min(Integer::compare)
                .get();

        System.out.println(minimus);
    }
}
