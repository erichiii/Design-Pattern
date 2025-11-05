public class Main {
    public static void main(String[] args) {
        System.out.println("Starting Hospital Management System Simulation...\n");

        // Create module instances
        PatientRecords patientRecords = new PatientRecords();
        Billing billing = new Billing();
        EmergencyAlerts emergencyAlerts = new EmergencyAlerts();

        // Simulate module operations
        patientRecords.updatePatientRecord("John Doe", "Flu Treatment");
        billing.generateBill("John Doe", 1200.50);
        emergencyAlerts.triggerAlert("Cardiac arrest in Ward 5!");

        // Verify Singleton behavior
        Logger logger1 = Logger.getInstance();
        Logger logger2 = Logger.getInstance();

        System.out.println("\nChecking Singleton behavior...");
        if (logger1 == logger2) {
            System.out.println("Logger is Singleton (both references are the same instance).");
        } else {
            System.out.println("Logger is NOT Singleton (different instances detected).");
        }

        // Close logger safely
        logger1.close();
        System.out.println("\nLogging completed. Check 'hospital_logs.txt' for output.");
    }
}