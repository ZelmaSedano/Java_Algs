import java.util.stream.*;
import java.util.*;

public class Practice {

    public static void main(String[] args) {
        List<Integer> nums = List.of(1, 2, 3, 4);

        List<Integer> result = nums.stream()
                .sorted(Collections.reverseOrder())
                .collect(Collectors.toList());

        System.out.println(result);
    }

}
