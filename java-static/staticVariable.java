public class staticVariable {
    String firstName;
    String lastName;
    static String university = "NTNU";

    public static void main(String[] args) {
        staticVariable s1 = new staticVariable();
        s1.firstName = "Jason";
        s1.lastName = "Wang";

        staticVariable s2 = new staticVariable();
        s2.firstName = "Jackie";
        s2.lastName = "Con";

        staticVariable s3 = new staticVariable();
        s3.firstName = "Kevin";
        s3.lastName = "Haung";

        System.out.println(s1.firstName + " " + s1.lastName + " " + staticVariable.university);
        System.out.println(s2.firstName + " " + s2.lastName + " " + staticVariable.university);
        System.out.println(s3.firstName + " " + s3.lastName + " " + staticVariable.university);
    }
}