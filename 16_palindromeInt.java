// create a method that checks to see if a given integer is a palindrome or not
public class Practice {
    boolean isPalindrome(int num) {
        if(num < 0) {
            return false;
        }

        // convert the int to string, then split it, reverse it, turn back into string, then int, and check to see if it's the same - if it is, return true
        String str = Integer.toString(num);
        // create an String to add letters to, loop backwards through string, and add to String
        String reversed = "";
        // create a variable to hold length of string value
        int strLength = str.length();
        // loop backwards
        for(int i = strLength-1; i >= 0; i--) {
            reversed += str.charAt(i);  // i is for Index
        }
        // convert back into a number and compare
        int newInt = Integer.parseInt(reversed);

        // has to be at the bottom, so everything else can run 
        return newInt == num;
    } // end of method 'isPalindrome'

	public static void main(String[] args) {  // main block
        Practice p = new Practice();

        System.out.println(p.isPalindrome(121));  // prints a string
		
	} // end of main method

} // end of class
