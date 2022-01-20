import java.util.stream.*;
import java.util.Map.Entry;
import java.util.*;

public class Practice {
    public static void main(String[] args) {
        List<Integer> list1 = List.of(1, 2, 3);
        List<Integer> list2 = List.of(4, 5, 6);

        // merge the list using streams
        List merged = Stream.concat(list1.stream(), list2.stream())
                .collect(Collectors.toList());
        System.out.println(merged);
    }
}
