import java.util.stream.*;
import java.util.Map.Entry;
import java.util.*;

public class Practice {
    public static boolean palindrome(String str) {
        if (str.length() == 0) {
            return false;
        }

        return str.equals(new StringBuilder(str).reverse().toString());
    }

    public static void main(String[] args) {
        Practice p = new Practice();
        System.out.println(p.palindrome("mom"));
    }
}
