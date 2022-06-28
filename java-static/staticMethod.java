public class staticMethod {
    // 1. Static methods can ONLY access and modify static variables.
    static int eventNumber;

    // 2. Static methods can be called/used without creating a class instance.
    static void incrementBy2() {
        eventNumber = eventNumber + 2;
        System.out.println(eventNumber);
    }

    public static void main(String[] args) {
        incrementBy2(); // 2
        incrementBy2(); // 4
        incrementBy2(); // 6
        incrementBy2(); // 8
        staticMethod.incrementBy2(); // doing excatly the same with above methods.
    }
}
