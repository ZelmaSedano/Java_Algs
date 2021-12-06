public class Practice {
    // create a method that finds the first non-repeating letter in a string
    void confirmEnding(String str, String target) {
        boolean result = str.endsWith(target);
        System.out.print(result);
    }

	public static void main(String[] args) {
		Practice p = new Practice();

        String myStr = "wow";
        p.confirmEnding(myStr, "e");
	} // end of main method

} // end of class
