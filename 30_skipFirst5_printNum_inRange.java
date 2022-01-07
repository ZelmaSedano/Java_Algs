import java.util.stream.*;

public class Practice {
    public static void main(String[] args) {
        IntStream
                .range(1, 10)
                // skips first 5
                .skip(5)
                .forEach(x -> System.out.print(x));
    }
}
