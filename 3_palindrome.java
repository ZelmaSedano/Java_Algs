public class Practice {
    // create a method that checks to see if a given string is a palindrome
    boolean isPalindrome(String str) {
        // edge-case scenario
        if(str.length() < 0) {
            return false;
        }

        str = str.toLowerCase();

        String reversed = ""; // reverse the string
        int strLength = str.length();  // save the length in variable

        // loop backwards through string
        for(int i = (strLength -1); i >= 0; i--) {
            reversed += str.charAt(i); // add char at i
        }

        if(str.equals(reversed)){
            return true;
        } else {
            return false;
        }
    }


	public static void main(String[] args) {
		Practice p = new Practice();

        System.out.print(p.isPalindrome("Mom"));
	} // end of main method

} // end of class
