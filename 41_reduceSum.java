import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Practice {

    public static void main(String[] args) {
        List<Integer> integers = List.of(1, 2, 3, 4, 5);

        int sum = integers.stream()
                .reduce(0, (a, b) -> a + b);

        System.out.println(sum);
    }
}
