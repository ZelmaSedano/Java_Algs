import java.util.stream.*;
import java.util.Map.Entry;
import java.util.*;

public class Practice {
    public static boolean palindrome(String str) {
        String reversed = new StringBuilder(str).reverse().toString();
        return str.equals(reversed);
    }

    public static void main(String[] args) {
        Practice p = new Practice();
        System.out.println(p.palindrome("mom"));
    }
}
