import java.util.*;

public class Practice {
    public static void main(String[] args) {
        // create a HashMap w/ String (key) & Integer (value) pairs
        // call is "scores"
        HashMap<String, Integer> scores = new HashMap<String, Integer>();

        scores.put("Kathy", 42);
        scores.put("Bert", 343);
        scores.put("Skyler", 420);

        System.out.println(scores);
        System.out.println(scores.get("Bert"));
    }
}
