package algorithms;

public class algorithms {

	public static void main(String[] args) {
		String str = "Hi there";
		int count = 0;
		
		// loop through str, if current element is a vowel
		// add to count
		for(int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if(ch == 'a'|| ch == 'e'|| ch == 'i' ||ch == 'o' ||ch == 'u'){
	            count ++;
	         }
		}
		
		System.out.println(count);
		
		
	} // end of main method

} // end of class
