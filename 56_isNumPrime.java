import java.util.*;
import java.util.stream.*;

public class Practice {
    public static boolean isPrime(int n) {
        // Corner case
        if (n <= 1)
            return false;

        // Check from 2 to n-1
        for (int i = 2; i < n; i++)
            if (n % i == 0)
                return false;
        // default return value
        return true;
    }
    public static void main(String[] args) {
        Practice p = new Practice();
        System.out.println(p.isPrime(17));
    }
}
