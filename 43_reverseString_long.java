import java.util.stream.*;
import java.util.*; // imports List

public class Practice {
    // create a method that reverses a given string
    public String reverseStr(String str) {
        // create a String varaible called "reverse"
        // set it equal to new StringBuilder that reverses & converts back to string
        String reversed = new StringBuilder(str).reverse().toString();
        return reversed;
    }

    public static void main(String[] args) {
        Practice p = new Practice();

        System.out.println(p.reverseStr("no"));
    }
}
