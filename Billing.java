
public class Billing {
    private Billing() { }

    public static void generateInvoice(String patientName, double amount) {
        Logger logger = Logger.getInstance();
        logger.log("[Billing] Invoice generated for " + patientName + ": ₱" + amount);
    }

    public static void billing(String patientName, double amount) {
        generateInvoice(patientName, amount);
    }
}
