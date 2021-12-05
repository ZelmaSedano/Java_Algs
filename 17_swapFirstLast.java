// swap the first and last elements of an array - this array is an array of chars
public class Practice {
    public static int[] swap(int[] arr) {
        int temp = arr[0]; // save the first index's value so we can use later
        arr[0] = arr[arr.length-1]; // assigns first element's value to last element's value
        arr[arr.length-1] = temp;

        return arr;
    }

	public static void main(String[] args) {  // main block
        Practice p = new Practice();    // creates a new object

        int[] myArr = {1,2,3};  // create an array of numbers
        p.swap(myArr);  // call swap method on p obj, and pass in new array
        
        // check to see if it worked
        for(int i = 0; i < myArr.length; i++) {
            System.out.println(myArr[i]);
        }
	} // end of main method

} // end of class
