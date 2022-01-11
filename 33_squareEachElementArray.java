import java.util.*;
import java.util.stream.*;

public class Practice {
    public static void main(String[] args) {
        // create a stream of an Array (Arrays)
        Arrays.stream(new int[] { 1, 2, 3, 4, 5 })
                .map(num -> num * num)
                .forEach(num -> System.out.println(num));
    }
}
