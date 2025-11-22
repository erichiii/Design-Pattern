
public class EmergencyAlerts {
    private EmergencyAlerts() { }

    public static void triggerAlert(String message) {
        Logger logger = Logger.getInstance();
        logger.log("[EmergencyAlerts] ALERT: " + message);
    }
}
