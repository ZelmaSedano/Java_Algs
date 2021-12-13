class Practice {
    // create a method that checks to see if a given string ends w/ target
    public boolean confirmEnding(String str, String target) {
        return str.endsWith(target);
    }

    // main method
    public static void main(String[] args) {
        Practice p = new Practice();
        System.out.println(p.confirmEnding("hi", "i"));
    }
}
