import java.util.stream.*;

public class Practice {
    public static void main(String[] args) {
        // you can use Stream.of to create a stream of custom data you pass in
        // in this example, we're passing in 3 strings, sorting them, and returning the
        // first one
        Stream.of("Ava", "Aneri", "Alberto")
                .sorted()
                .findFirst()
                .ifPresent(System.out::println);
    }
}
