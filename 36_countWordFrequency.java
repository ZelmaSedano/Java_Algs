import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Practice {
    public static void main(String[] args) {
        String str = "Lorem adipising ipsum dolor sit Lorem amet Consectetur adipising elit Lorem ipsum dolor";

        // this converts the string into an array
        List<String> list = Stream.of(str).map(w -> w.split("\\s+")).flatMap(Arrays::stream)
                .collect(Collectors.toList());

        // this converts the array into a map?
        // create a map that has a String as key & Integer at value
        // call it 'wordCounter'
        Map<String, Integer> wordCounter = list.stream()
                // collect that list into a Map - take word & lowercase it, then sum up word's
                // count using Integer::sum
                .collect(Collectors.toMap(w -> w.toLowerCase(), w -> 1, Integer::sum));

        System.out.println(wordCounter);
    }
}
