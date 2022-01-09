import java.util.stream.*;
import java.util.*; // imports List

public class Practice {
    public static void main(String[] args) {
        // make a map out of a list
        // key & values alternate
        Map<String, Integer> ageOfFriends = Map.of("Raphael", 30, "Olivia", 25, "Thibaut", 26);
        System.out.println(ageOfFriends);
    }
}
