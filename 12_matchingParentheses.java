package algorithms;

public class algorithms {

	public static void main(String[] args) {
		int counter = 0;
		String str = "()";	// change this code
		
		if(str.length() == 0) {
			System.out.println("not a valid entry");
		} else {
			for(char ch : str.toCharArray()) {
				if(ch == '(') counter++;	// go up 1
				else if(ch == ')') counter--;	// go down 1
			}
			
			if(counter == 0) {
				System.out.println("matching parentheses!");
			} else {
				System.out.println("not matching :(");
			}
		}
		
		
		
		
	} // end of main method

} // end of class
