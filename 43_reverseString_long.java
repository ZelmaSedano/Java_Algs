class practice{
    // method
    public String reverseStringShort(String str) {
        return new StringBuilder(str).reverse().toString();

    }

    public static void main(String[] args)  {
        practice p = new practice();
        System.out.println(p.reverseStringShort("hi"));
    }
}
