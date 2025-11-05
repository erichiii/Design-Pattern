<<<<<<< HEAD
public class PatientRecords {
    private Logger logger = Logger.getInstance();

    public void updatePatientRecord(String patientName, String treatment) {
        System.out.println("Updating patient record for: " + patientName);
        logger.log("[PatientRecords] Updated record for " + patientName + " with treatment: " + treatment);
=======

public class PatientRecords {
    public void admitPatient(String name) {
        Logger logger = Logger.getInstance();
        logger.log("Patient admitted: " + name);
>>>>>>> 096108abc15c288c5a9b675eccd82839164af327
    }
}
