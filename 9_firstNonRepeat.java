import java.util.HashMap;

class Practice {
    // create a method to find the first non-repeating character in a string
    public char firstNonRepeat(String str) {
        // edge case - if it's empty, return a 0 (since you can only return the same
        // type as declared in the method, put single quotes around it to make it a char
        // -1 won't work b/c having two characters breaks the char rule)
        if (str.length() == 0) {
            return '0';
        }

        // create a HashMap & add each letter to it
        HashMap<Character, Integer> characterCount = new HashMap<>();

        // using an enhance for loop, convert the string into an array of characters and
        // loop through
        for (char c : str.toCharArray()) {
            // if char is not in hashmap
            if (!characterCount.containsKey(c)) {
                // add the character - c = character, 1 = value
                characterCount.put(c, 1);
            } else {
                // if it does exist, then get the value for c and add 1 while replacing its
                // former value with new value
                characterCount.put(c, characterCount.get(c) + 1);
            }
        }

        // loop through the charArray again and check to see if any char's value is
        // if it is, return it
        for (char c : str.toCharArray()) {
            if (characterCount.get(c) == 1) {
                return c;
            }
        }
        // default return statement
        return '0';
    }

    public static void main(String[] args) {
        Practice p = new Practice();
        System.out.println(p.firstNonRepeat("hi"));
    }
}
