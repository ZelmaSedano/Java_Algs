import java.util.*;

public class Practice {
    // create a method that checks to see if a given string ends w/ a given target
    // string --> ex: "tree", "ee" --> true
    public boolean confirmEnding(String str, String target) {
        return str.endsWith(target);
    }

    // main method where new Objects are created & methods are called
    public static void main(String[] args) {
        // new object
        Practice p = new Practice();

        System.out.println(p.confirmEnding("hi", "e"));
    }
}
