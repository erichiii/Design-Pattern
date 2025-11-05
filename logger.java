// Singleton Logger Class
public class Logger {

    // Step 1: Create a private static instance of the class
    private static Logger instance;

    // Step 2: Make the constructor private so it can't be instantiated outside
    private Logger() {
        // Optional: Initialize log file or settings
    }

    // Step 3: Provide a public static method to get the instance
    public static Logger getInstance() {
        if (instance == null) {
            instance = new Logger();
        }
        return instance;
    }

    // Step 4: Logging method
    public void log(String message) {
        System.out.println("[LOG] " + message);
    }
}
