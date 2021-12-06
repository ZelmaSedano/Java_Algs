public class Practice {
    // create a method that checks to see how many vowels are in a given string
    void vowelCount(String str) {
        // create a count variable
        int count = 0;
        // loop through the string, if current char is a vowel
        for(int i = 0; i < str.length(); i++) {
            // create a variable called "ch" to hold current char
            char ch = str.charAt(i);
            // check to see if current char is a vowel
            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                count++;
            }
        }

        System.out.print(count);
    }

	public static void main(String[] args) {
		Practice p = new Practice();

        String myStr = "wow";
        p.vowelCount(myStr);
	} // end of main method

} // end of class
