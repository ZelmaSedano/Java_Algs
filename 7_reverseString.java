class Practice {
    // create a method that reverses and returns a given string
    public String reverseString(String str) {
        // if string is empty, return null
        if (str.length() == 0) {
            return null;
        }

        String result = ""; // empty string to add to
        str = str.replaceAll("\\s+", "");
        // create a variable to hold the String's length
        int length = str.length();

        for (int i = length - 1; i >= 0; i--) {
            result += str.charAt(i);
        }

        return result;
    }

    // main method
    public static void main(String[] args) {
        Practice p = new Practice();
        System.out.println(p.reverseString("h   i"));
    }
}
