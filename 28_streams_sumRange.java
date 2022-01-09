import java.util.stream.*;

public class Practice {

    public static void main(String[] args) {
        // print out the results by nesting everything inside a System.out statement
        System.out.println(
                IntStream
                        .range(1, 5) // stops at 4, 5 is non-inclusive
                        .sum());
    }

}
