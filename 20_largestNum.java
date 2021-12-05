import java.util.Arrays;

// swap the first and last elements of an array - this array is an array of chars
public class Practice {
  void largestNum(int[] arr) {
    Arrays.sort(arr);

    System.out.print(arr[arr.length - 1]);
  }

  public static void main(String[] args) { // main block
    Practice p = new Practice(); // creates a new object

    int[] myArr = { 33, 3333, 3 };
    p.largestNum(myArr);

  } // end of main method
} // end of class
