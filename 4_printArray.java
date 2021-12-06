public class Practice {
    // create a method that checks to see if a given string is a palindrome
    void printArray(int[] arr) {
        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
        }
    }
	public static void main(String[] args) {
		Practice p = new Practice();

        int[] myArr = {1,2,3};
        p.printArray(myArr);
	} // end of main method

} // end of class
