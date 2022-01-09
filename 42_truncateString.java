public class Practice {
    // create a method that shortens/truncates a string at int length's length
    public String truncateString(String str, int length) {
        return str.substring(0, length) + "...";
    }

    public static void main(String[] args) {
        Practice p = new Practice();

        System.out.println(p.truncateString("hello", 2));
    }

}
