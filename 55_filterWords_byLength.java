import java.util.stream.*;
import java.util.Map.Entry;
import java.util.*;

public class Practice {
    public static void main(String[] args) {
        String words = "hi there how are y'all doing";

        List<String> result = Stream.of(words.split(" "))
                .filter(x -> x.length() > 3)
                .collect(Collectors.toList());

        System.out.println(result);
    }
}
