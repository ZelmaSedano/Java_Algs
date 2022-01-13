import java.util.stream.*;
import java.util.*;
import java.util.Map.Entry;

public class Practice {
    public boolean confirmEnding(String str, String target) {
        // target can return a false positive when empty
        if (str.length() == 0) {
            return false;
        }
        if (target.length() == 0) {
            return false;
        }

        if (str.endsWith(target)) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        Practice p = new Practice();
        System.out.println(p.confirmEnding("Hi", ""));
    }
}
