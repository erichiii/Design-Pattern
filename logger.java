import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;

public class Logger {
    private static Logger instance;
    private BufferedWriter writer;

    // file name -- for simulation purposes it is a text
    private static final String LOG_FILE = "hospital_logs.txt";

    // private constructor to prevent instantiation
    private Logger() {
        try {
            writer = new BufferedWriter(new FileWriter(LOG_FILE, true)); // Append mode
            writer.write("=== Hospital Management System Log Started: " + LocalDateTime.now() + " ===\n");
            writer.flush();
        } catch (IOException e) {
            System.err.println("Failed to initialize logger: " + e.getMessage());
        }
    }

    // public static method to get the single instance
    public static synchronized Logger getInstance() {
        if (instance == null) {
            instance = new Logger();
        }
        return instance;
    }

    // core log method
    public synchronized void log(String message) {
        try {
            writer.write(message + "\n");
            writer.flush();
        } catch (IOException e) {
            System.err.println("Error writing log: " + e.getMessage());
        }
    }

    // close the writer safely
    public synchronized void close() {
        try {
            if (writer != null) {
                writer.write("=== Log Ended: " + LocalDateTime.now() + " ===\n\n");
                writer.close();
                writer = null;
            }
        } catch (IOException e) {
            System.err.println("Error closing log file: " + e.getMessage());
        } finally {
            instance = null;
        }
    }
}