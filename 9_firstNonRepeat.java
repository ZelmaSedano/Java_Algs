package algorithms;

public class algorithms {

	public static void main(String[] args) {
		// array of letters
		String str = "eer";
		
		// loop through the str checking i
		for(char i : str.toCharArray()) { // converts str to arr
			if(str.indexOf(i) == str.lastIndexOf(i)) {
				System.out.println("first non-repeating char is " + i);
				break;	// so you don't run it again and 
						// a 2nd non-repeat
			}
			// - checks for the presence of the current 
			//   element in the whole array of chars
			// - if the position of the last element is NOT present 
			//   in the string so far, then return the current letter
		}
	} // end of main method

} // end of class
