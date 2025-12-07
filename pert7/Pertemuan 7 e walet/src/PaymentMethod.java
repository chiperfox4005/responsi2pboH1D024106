public interface PaymentMethod {

    void processPayment();

    String getPaymentDetails();

    double getTransactionFee();

    double getBalance();
}
