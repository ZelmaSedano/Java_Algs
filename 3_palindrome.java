package algorithms;

public class algorithms {

	public static void main(String[] args) {
		String str = "Radar";	// the string we're checking
		String reverseStr = "";	// the string we're adding to
		int strLength = str.length();	// length of string
		
		for(int i = (strLength - 1); i>= 0; i--) {
			reverseStr += str.charAt(i); // add the char at i
		}
		
		if(str.toLowerCase().equals(reverseStr.toLowerCase())) {
			System.out.println(str + " is a palindrome");
		} else {
			System.out.println(str + " is not a palindrome");
		}
		
	} // end of main method

} // end of class
