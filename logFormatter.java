import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
public class logFormatter {
    private static logFormatter instance;
    private final DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

    private logFormatter() { }

    public static synchronized logFormatter getInstance() {
        if (instance == null) {
            instance = new logFormatter();
        }
        return instance;
    }

    public String format(String level, String message){
        String timestamp = LocalDateTime.now().format(dtf);
        return "[" + timestamp + "] [" + level + "] " + message;
    }
}
