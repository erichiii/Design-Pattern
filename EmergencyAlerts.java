public class EmergencyAlerts {
    private Logger logger = Logger.getInstance();

    public void triggerAlert(String message) {
        System.out.println("Emergency Alert Triggered: " + message);
        logger.log("[EmergencyAlerts] ALERT: " + message);
    }
}