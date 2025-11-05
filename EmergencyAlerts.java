<<<<<<< HEAD
public class EmergencyAlerts {
    private Logger logger = Logger.getInstance();

    public void triggerAlert(String message) {
        System.out.println("Emergency Alert Triggered: " + message);
        logger.log("[EmergencyAlerts] ALERT: " + message);
    }
}
=======

public class EmergencyAlerts {
    public void triggerAlert(String message) {
        Logger logger = Logger.getInstance();
        logger.log("F6A8 Emergency Alert: " + message);
    }
}
>>>>>>> 096108abc15c288c5a9b675eccd82839164af327
