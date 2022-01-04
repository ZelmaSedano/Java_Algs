import java.util.*;

public class Practice {
    public static void main(String[] args) {
        ArrayList<String> songList = new ArrayList<String>();
        songList.add("Pink Moon");
        songList.add("Somersault");
        songList.add("Circles");
        songList.add("Deep Channel");
        songList.add("Pink Moon");
        songList.add("Pink Moon");
        songList.add("Listen");
        songList.add("Listen");

        TreeSet<String> songSet = new TreeSet<String>();
        songSet.addAll(songList);
        System.out.println(songSet);
        // all the duplicates are removed
    }
}
