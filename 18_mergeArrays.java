// swap the first and last elements of an array - this array is an array of chars
public class Practice {
  void mergeArrays(int[] arr1, int[] arr2) {
    int length = arr1.length + arr2.length;
    int[] result = new int[length];
    int position = 0;

    // loop to add both array's elements to the result array
    for (int element : arr1) {
      result[position] = element;
      position++;
    }

    for (int element : arr2) {
      result[position] = element;
      position++;
    }

    for (int i = 0; i < result.length; i++) {
      System.out.print(result[i] + ",");
    }
  }

  public static void main(String[] args) { // main block
    Practice p = new Practice(); // creates a new object

    int[] newArr1 = { 1, 2, 3 }; // create an array of numbers
    int[] newArr2 = { 4, 5, 6 };
    p.mergeArrays(newArr1, newArr2);

  } // end of main method

} // end of class
