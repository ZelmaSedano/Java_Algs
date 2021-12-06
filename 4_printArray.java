// import Array util library
import java.util.Arrays;    

public class Practice {
    // create a method that prints out the elements of an array
    void printElements(String[] arr) {
        System.out.println(Arrays.toString(arr));
    }
	public static void main(String[] args) {
		Practice p = new Practice();

        String[] myArr = {"alone", "at", "last"};
        p.printElements(myArr);
	} // end of main method

} // end of class
