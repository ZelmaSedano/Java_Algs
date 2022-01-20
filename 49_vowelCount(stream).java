import java.util.stream.*;
import java.util.Map.Entry;
import java.util.*;

public class Practice {
    public static void main(String[] args) {
        List<String> vowels = List.of("a", "e", "i", "o", "u");

        String str = "hello";

        long count = Stream.of(str.split(""))
                .filter(vowels::contains)
                .count();

        System.out.println(count);
    }
}
