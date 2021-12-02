package algorithms;

public class algorithms {

	public static void main(String[] args) {
		// string we're analyzing
		String str = "yola";
		// declare variable to hold reversed string
		String reversed = "";
		
		// create a variable to hold the string's length
		int strLength = str.length();
		
		// loop backwards through the string
		for(int i = (strLength - 1); i>= 0; i--) {
			reversed += str.charAt(i); // add the char at i
		}
		
		System.out.println(reversed);
		
		
	} // end of main method

} // end of class
