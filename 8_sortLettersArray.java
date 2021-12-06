// create a method that sorts a given array
import java.util.Arrays;  // - import Array utils library to use .sort()

public class Practice {
    // create a method to sort the chars in an array
    void sortArr(int[] arr) {
        Arrays.sort(arr);

        System.out.println(Arrays.toString(arr));
    }
	public static void main(String[] args) {
		Practice p = new Practice();

        int[] myArr = {33,3333,333,33,3};
        p.sortArr(myArr);;
	} // end of main method

} // end of class
