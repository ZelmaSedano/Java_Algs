import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Practice {

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);

        List<Integer> even = numbers.stream()
                .filter(number -> number % 2 == 0)
                .collect(Collectors.toList());
        System.out.println("even numbers:" + even);
    }
}
