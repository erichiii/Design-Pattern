import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
public class logFormatter {
    private DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
    
    public String format(String level, String message){
        String timestamp = LocalDateTime.now().format(dtf);
        return "[" + timestamp + "] [" + level + "] " + message;
    }
}
