import java.util.stream.*;
import java.util.*;
import java.util.Map.Entry; // imports Map.Entry

public class Practice {
    public String capitalizeFirstLetter(String str) {
        String result = Stream.of(str.split("\\s"))
                .map(word -> word.substring(0, 1).toUpperCase() + word.substring(1))
                .collect(Collectors.joining(" "));

        return result;
    }

    public static void main(String[] args) {
        Practice p = new Practice();
        System.out.println(p.capitalizeFirstLetter("what is up"));
    }
}
