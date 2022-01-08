import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Practice {

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(33, 3333, 3, 333);

        List<Integer> result = list.stream()
                .sorted()
                .collect(Collectors.toList());

        System.out.println(result);

    }

}
