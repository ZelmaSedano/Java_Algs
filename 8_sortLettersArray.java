package algorithms;
// !!!! import arrays method from utils !!!!
import java.util.Arrays;

public class algorithms {

	public static void main(String[] args) {
		// array of letters
		char arr[] = {'i', 'e', 'o', 'u', 'd'};
		
		Arrays.sort(arr);
		
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]);
		}
	} // end of main method

} // end of class
