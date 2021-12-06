public class Practice {
    // create a method that reverses a given string
    void reverseStr(String str) {
        // create a string variable to hold reversed string
        String reversed = "";
        // create a variable to hold length of string, since we can't use str.length() unlike arr.length()
        int strLength = str.length();

        // loop backwards through string, adding to reversed
        for(int i = (strLength-1); i >= 0; i--) {
            reversed += str.charAt(i);
        }

        System.out.print(reversed);
    }

	public static void main(String[] args) {
		Practice p = new Practice();

        String myStr = "word";
        p.reverseStr(myStr);
	} // end of main method

} // end of class
