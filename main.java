public class main {
    public static void main(String[] args) {
        Logger logger1 = Logger.getInstance();
        Logger logger2 = Logger.getInstance();

        logger1.log("Application started.");
        logger2.log("User logged in.");

        // Check if both references point to the same instance
        System.out.println("Same instance? " + (logger1 == logger2)); // true
    }
}
