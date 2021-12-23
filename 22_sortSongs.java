import java.util.*;

public class Practice {
  public static void main(String[] args) {

    ArrayList<String> songList = new ArrayList<String>();

    songList.add("Pink Moon");
    songList.add("Somersault");
    songList.add("Circles");
    songList.add("Deep Channel");
    songList.add("Passenger");
    songList.add("Listen");

    Collections.sort(songList);
    System.out.println(songList);
  }
}
