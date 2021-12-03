public class SleepIn {
  // create a method that takes in two booleans
  void setClock(boolean weekday, boolean vacation) {
    if (!weekday || vacation) {
      System.out.println(true);
    } else {
      System.out.println(false);
    }
  }
  // create a main block 
  public static void main(String[] args) {
    SleepIn one = new SleepIn();

    one.setClock(false, false); // true
    one.setClock(true, false);  // false
    one.setClock(false, true);  // true
  }
}
// sleepIn(false, false) → true
// sleepIn(true, false) → false
// sleepIn(false, true) → true
