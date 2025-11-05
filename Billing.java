public class Billing {
    private Logger logger = Logger.getInstance();

    public void generateBill(String patientName, double amount) {
        System.out.println("Generating bill for: " + patientName);
        logger.log("[Billing] Generated bill for " + patientName + " - Amount: ₱" + amount);
    }
}
