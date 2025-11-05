public class PatientRecords {
    private Logger logger = Logger.getInstance();

    public void updatePatientRecord(String patientName, String treatment) {
        System.out.println("Updating patient record for: " + patientName);
        logger.log("[PatientRecords] Updated record for " + patientName + " with treatment: " + treatment);
    }
}
