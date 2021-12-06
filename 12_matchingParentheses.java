public class Practice {
    // create a method that checks to see if there is an equal number of opening and closing parentheses
    void matchingParentheses(String str) {
        // initialize a count variable
        int counter = 0; 
        // error-handling: if length is 0, print not valid
        if(str.length() == 0) {
            System.out.println("Please enter parentheses");
        } else {
            // using a for loop, check each char
            // covert string to Array of chars
            for(char ch : str.toCharArray()) {
                if(ch == '(') counter++;
                else if(ch == ')') counter--;
            }
        }

        if(counter == 0) {
            System.out.println("equal parentheses!");
        } else {
            System.out.println("parenthese aren't equal :( ");
        }
    }
	public static void main(String[] args) {
		Practice p = new Practice();
		p.matchingParentheses(")");
	} // end of main method

} // end of class
