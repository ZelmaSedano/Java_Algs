public class Practice {
    // create a method that finds the first non-repeating letter in a string
    void firstNonRepeat(String str) {
        // loop through the str, checking i
        // convert string to an array of chars w/ .toCharArray
        for(char i : str.toCharArray()) {
            // if the current element is only present once
            // check the .lastIndexOf i and see if the current element is the last index of that char
            // if it is the last index, then return i & break
            if(str.indexOf(i) == str.lastIndexOf(i)) {
                System.out.print(i);
                break;  // stop program from running after
            }
        }
    }

	public static void main(String[] args) {
		Practice p = new Practice();

        String myStr = "wword";
        p.firstNonRepeat(myStr);
	} // end of main method

} // end of class
