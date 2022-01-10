import java.util.stream.*;
import java.util.*; // imports Arrays

public class Practice {
    public static void main(String[] args) {
        // create a stream of Names
        String result = Stream.of("Ava", "Aneri", "Alberto")
                .sorted()
                .findFirst()
                .get();

        System.out.println(result);
    }
}
