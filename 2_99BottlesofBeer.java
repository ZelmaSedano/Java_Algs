package algorithms;

public class algorithms {

	public static void main(String[] args) {
		int beerNum = 20;
		String word = "bottles";
		
		// loop down from num to 0
		while(beerNum > 0) {
			// when beerNum gets down to 1, use single 
			if(beerNum == 1) {
				word = "bottle";
			}
			
			System.out.println(beerNum + " " + word + " of beer on the wall");
			System.out.println(beerNum + " " + word + " of beer");
			System.out.println("Take one down, pass it around");
			
			// decrement beerNum
			beerNum--;
			
			// if beerNum is above 0, print out all the words
			if(beerNum > 0) {
				System.out.println(beerNum + " " + word + " of beer on the wall");
			} else {
				System.out.println("No more bottles of beer on the wall");
			} // end conditional block
			System.out.println("---");
		} // end while loop
	} // end of main method

} // end of class
