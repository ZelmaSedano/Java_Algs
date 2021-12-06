// create a method that repeats a string num times
class Practice {
    void repeatString(String str,int num) {
        String result = "";

        int i=0;
        while(i < num) {
            result = result + str;
            i++;    // iterate up so it terminates
        }

        System.out.print(result);
    }
    public static void main(String[] args) {  // main block
        // create a new object & call repeatString on it
        Practice p = new Practice();

        String myStr = "hi";
        p.repeatString(myStr, 3);
    }
}
