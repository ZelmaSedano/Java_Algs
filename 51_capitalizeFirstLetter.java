import java.util.stream.*;
import java.util.Map.Entry;
import java.util.*;

public class Practice {
    public static void main(String[] args) {
        String str = "what's up";

        String result = Stream.of(str.split("\\s"))
                .map(x -> x.substring(0, 1).toUpperCase() + x.substring(1))
                .collect(Collectors.joining(" "));

        System.out.println(result);

    }
}
