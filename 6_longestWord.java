package algorithms;

public class algorithms {

	public static void main(String[] args) {
		// string we're analyzing
		String str = "Today is a new day";
		// split the string into an array of words
		String [] words = str.split(" "); 
		
		String longest = "";
		
		// loop through the array
		for(int i = 0; i < words.length; i++) {
			if(words[i].length() > longest.length()) {
				longest = words[i];
			}
		}
		
		System.out.println(longest);
		
		
	} // end of main method

} // end of class
