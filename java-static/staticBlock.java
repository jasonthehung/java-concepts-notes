// Static blocks in Java are similar to constructors.
// We can use them to initialize static variables, and they are executed by 
// the compiler before the "main" method.
public class staticBlock {
    static int year;

    static {
        year = 2022;
        System.out.println("This code block got executed first.");
    }

    public static void main(String[] args) {
        System.out.println("Hello World." + " " + year);
        year = 2023;
        System.out.println("Hello World." + " " + year);
    }
}
