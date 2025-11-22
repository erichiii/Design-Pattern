public class PatientRecords {
    private PatientRecords() { }

    public static void patientRecord(String name, String treatment) {
        Logger logger = Logger.getInstance();
        logger.log("[PatientRecords] Updated record for " + name + " with treatment: " + treatment);
    }
}
