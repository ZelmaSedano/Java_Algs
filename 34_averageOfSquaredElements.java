import java.util.stream.*;
import java.util.*;

public class Practice {

    public static void main(String[] args) {
        List<Integer> nums = List.of(1, 2, 3, 4);

        OptionalDouble stats = nums.stream()
                .mapToInt(x -> x.intValue())
                .average();

        System.out.println(stats.getAsDouble());
    }

}
