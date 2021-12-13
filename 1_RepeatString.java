class Practice {
    // create a function that repeats a given string int num times
    public String repeatString(String str, int num) {
        return str.repeat(num);
    }

    // main method
    public static void main(String[] args) {
        Practice p = new Practice();
        System.out.println(p.repeatString("hi", 3));
    }
}
