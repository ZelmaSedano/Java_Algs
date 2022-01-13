import java.util.stream.*;
import java.util.*;

public class Practice {
    public static void main(String[] args) {
        // reduce sum
        List<Integer> nums = List.of(1, 2, 3, 4, 5);

        int result = nums.stream()
                .reduce(0, (a, b) -> a + b);

        System.out.println(result);

    }
}
