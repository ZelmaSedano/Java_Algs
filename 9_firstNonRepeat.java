import java.util.stream.*;
import java.util.*;
import java.util.Map.Entry; // imports Map.Entry

public class Practice1 {
  public void firstNonRepeat(String str) {
    // create a LinkedHashMap, because that keeps the order intact
    Map<Character, Integer> charCount = new LinkedHashMap<>(str.length());

    // using enhanced for loop, loop through the string & convert it to an Array of
    // chars
    for (char c : str.toCharArray()) {
      // if HashMap contains c, then make value previous value + 1
      // if it doens't containe c, then add and make value 1
      charCount.put(c, charCount.containsKey(c) ? charCount.get(c) + 1 : 1);
    }

    // loop through Entry of chars & ints & call each element 'entry'
    // convert map to entrySet
    for (Entry<Character, Integer> entry : charCount.entrySet()) {
      if (entry.getValue() == 1) {
        System.out.println(entry.getKey());
        return;
      }
    }
  }

  public static void main(String[] args) {
    Practice p = new Practice();
    p.firstNonRepeat("hi there");
  }
}
