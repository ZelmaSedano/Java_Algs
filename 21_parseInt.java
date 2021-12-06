public class Practice {
    // create a method that converts a String into an integer & return it
    int convertNum(String str) {
        int result = Integer.parseInt(str);

        return result;
    }

	public static void main(String[] args) {
		Practice p = new Practice();
        System.out.print(p.convertNum("17"));
	} // end of main method

} // end of class
