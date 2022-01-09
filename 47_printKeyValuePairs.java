import java.util.stream.*;
import java.util.*; // imports List

public class Practice {
    public static void main(String[] args) {
        Map<String, Integer> ageOfFriends = Map.of("Raphael", 30, "Olivia", 25, "Thibaut", 26);

        // .forEach method
        ageOfFriends.forEach((friend, age) -> System.out.println(friend + " is " + age + " years old."));
    }
}
