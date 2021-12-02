package algorithms;

public class algorithms {

	public static void main(String[] args) {
		// Word Count Algorithm
		String str1 = "Today is a New Day";
		
		// split str1 into an array of words
		String[] wordArray = str1.trim().split(" ");
		
		// you can't print out array, you have to loop & print
//		for(int i = 0; i < wordArray.length; i++) {
//			System.out.println(wordArray[i]);
//		}
		
		// print out the length of array
		System.out.println(wordArray.length);
		
	} // end of main method

} // end of class
