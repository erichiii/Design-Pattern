
public class EmergencyAlerts {
    public void triggerAlert(String message) {
        Logger logger = Logger.getInstance();
        logger.log("F6A8 Emergency Alert: " + message);
    }
}
