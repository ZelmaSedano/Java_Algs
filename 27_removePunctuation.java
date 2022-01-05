import java.util.*;

public class Practice {
    public static void main(String[] args) {
        String myStr = "what is up!";
        String result = myStr.replaceAll("[^a-zA-Z]", " ");
        System.out.println(result);
    }
}
