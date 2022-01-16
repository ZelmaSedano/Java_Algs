import java.util.stream.*;
import java.util.*;

public class Practice {
    public static void fizzBuzz(int n) {
        for (int i = 1; i <= n; i++) {
            if (i % 15 == 0) {
                System.out.println("fizz");
            } else if (i % 3 == 0) {
                System.out.println("buzz");
            } else {
                System.out.println(i);
            }
        }
    }

    public static void main(String[] args) {
        Practice p = new Practice();
        p.fizzBuzz(15);
    }

}
