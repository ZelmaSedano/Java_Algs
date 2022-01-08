import java.util.Arrays;
import java.util.List;
import java.util.stream.*;

public class Practice {

    public static void main(String[] args) {
        System.out.println(
                IntStream
                        // non-inclusive: 1+2+3+4 = 10
                        .range(1, 5)
                        .sum());

    }

}
