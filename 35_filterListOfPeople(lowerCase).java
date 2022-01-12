import java.util.stream.*;
import java.util.*;

public class Practice1 {

  public static void main(String[] args) {
    List<String> people = List.of("Al", "Ankit", "Sarika", "Hans", "Eric");

    List<String> lowerCase = people.stream()
        .map(String::toLowerCase)
        .filter(x -> x.startsWith("a"))
        .collect(Collectors.toList());

    System.out.println(lowerCase);

  }
}
