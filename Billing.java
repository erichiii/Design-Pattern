<<<<<<< HEAD
public class Billing {
    private Logger logger = Logger.getInstance();

    public void generateBill(String patientName, double amount) {
        System.out.println("Generating bill for: " + patientName);
        logger.log("[Billing] Generated bill for " + patientName + " - Amount: ₱" + amount);
=======

public class Billing {
    public void generateInvoice(String patientName, double amount) {
        Logger logger = Logger.getInstance();
        logger.log("Invoice generated for " + patientName + ": ₱" + amount);
>>>>>>> 096108abc15c288c5a9b675eccd82839164af327
    }
}
