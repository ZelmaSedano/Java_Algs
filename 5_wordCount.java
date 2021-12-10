class Practice {
    // create a method that finds the number of words in a given string
    void wordCount(String str) {
        // split string into an array of words
        String[] words = str.trim().split(" ");

        System.out.println(words.length);
    }

    // main method
    public static void main(String[] args) {
        Practice p = new Practice();

        p.wordCount("hi there");
    }
}
