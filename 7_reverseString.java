import java.util.stream.*;
import java.util.*; // imports List

public class Practice {
    // create a method that returns a reversed string - use the long method
    public String reverseString(String str) {
        if (str.length() == 0) {
            return "please enter a valid string";
        }

        String reversed = "";

        for (int i = str.length() - 1; i >= 0; i--) {
            reversed += str.charAt(i);
        }

        return reversed;
    }

    public static void main(String[] args) {
        Practice p = new Practice();

        System.out.println(p.reverseString("no"));
    }
}
