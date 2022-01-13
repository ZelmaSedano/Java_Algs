import java.util.stream.*;
import java.util.*;
import java.util.Map.Entry; // imports Map.Entry

public class Practice {
    public static void main(String[] args) {
        int result = IntStream
                .range(1, 6)
                .sum();

        System.out.println(result);

    }
}
