import java.util.stream.*;

public class Practice {
    public static void main(String[] args) {
        System.out.println(
                IntStream
                        .range(1, 5)
                        .sum());
    }
}
