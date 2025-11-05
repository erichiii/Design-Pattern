
public class Billing {
    public void generateInvoice(String patientName, double amount) {
        Logger logger = Logger.getInstance();
        logger.log("Invoice generated for " + patientName + ": ₱" + amount);
    }
}
