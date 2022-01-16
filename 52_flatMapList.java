import java.util.stream.*;
import java.util.*;

public class Practice {

    public static void main(String[] args) {
        List<Integer> list1 = List.of(1, 2, 3);
        List<Integer> list2 = List.of(4, 5, 6);
        List<Integer> list3 = List.of(7, 8, 9);

        List<List<Integer>> listOfLists = List.of(list1, list2, list3);
        System.out.println(listOfLists); // [[1,2,3], [4,5,6], [7,8,9]]

        List<Integer> result = listOfLists.stream()
                .flatMap(x -> x.stream())
                .collect(Collectors.toList());

        System.out.println(result); // [1,2,3,4,5,6,7,8,9]
    }

}
