public class EWalletPayment implements PaymentMethod {

    private String namaLayanan;
    private double saldo;
    private double nominalBayar;

    public EWalletPayment(String namaLayanan, double saldo, double nominalBayar) {
        this.namaLayanan = namaLayanan;
        this.saldo = saldo;
        this.nominalBayar = nominalBayar;
    }

    @Override
    public void processPayment() {
        double totalBayar = nominalBayar + getTransactionFee();

        System.out.println("Memproses pembayaran sebesar " + nominalBayar + "...");

        if (saldo >= totalBayar) {
            saldo -= totalBayar;
            System.out.println("Pembayaran berhasil!");
        } else {
            System.out.println("Pembayaran gagal! Saldo tidak cukup.");
        }
    }

    @Override
    public String getPaymentDetails() {
        return "Pembayaran dilakukan melalui " + namaLayanan;
    }

    @Override
    public double getTransactionFee() {
        return 2000;
    }

    @Override
    public double getBalance() {
        return saldo;
    }
}
