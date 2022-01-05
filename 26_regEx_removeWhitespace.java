import java.util.*;

public class Practice {
    // methods
    // create a method called wordCount that returns the number of words in a given
    // string

    public static void main(String[] args) {
        String myStr = "what is up";
        // no space b/w final quotes to remove spaces
        String result = myStr.replaceAll("\\s+", "");
        System.out.println(result);
    }
}
