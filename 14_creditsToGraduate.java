// create a program to check and see if attending a seminar is enough to help you graduate
class Credits {
  public static void main(String [] args) {
    double creditsEarned = 176.5;
    double creditsOfSeminar = 8;
    double creditsToGraduate = 180;
    
    // do you have enough credits currently to graduate?
    System.out.println(creditsEarned > creditsToGraduate); // false

    // take the seminar
    // create a variable called creditsAfterSeminar & assign creditsEarned + creditsOfSeminar
    double creditsAfterSeminar = creditsEarned + creditsOfSeminar;

    // check to see if you have enough credits to graduate AFTER attending seminar
    System.out.println(creditsAfterSeminar > creditsToGraduate);  // true
  }
}
