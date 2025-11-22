public class main {
    public static void main(String[] args) {
        System.out.println("Starting Hospital Management System Simulation...\n");

        // Simulate module operations -- change hard-coded values as needed
        String patientName = "Cynthia Erivo";
        String treatment = "Voice Box Damage";
        String alertMessage = "Code Black in Ward 1";

        PatientRecords.patientRecord(patientName, treatment);
        Billing.billing(patientName, 1200.50);
        EmergencyAlerts.triggerAlert(alertMessage);

        // verify Singleton behavior
        Logger logger1 = Logger.getInstance(); // singleton behavior shown through getInstance
        Logger logger2 = Logger.getInstance();

        System.out.println("\nChecking Singleton behavior...");
        if (logger1 == logger2) {
            System.out.println("Logger is Singleton (both references are the same instance).");
        } else {
            System.out.println("Logger is NOT Singleton (different instances detected).");
        }

        // Close logger safely
        logger1.close();
        System.out.println("\nLogging completed and saved in text file.");
    }
}