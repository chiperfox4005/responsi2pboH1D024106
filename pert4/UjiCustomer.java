public class UjiCustomer {
    public static void main(String[] args) {

        System.out.println("=== DATA CUSTOMER BELANJAKU ===");

        Customer budi = new Customer("Budi Santoso", "CST-001", 500000);
        System.out.println("Status: Customer Biasa");
        budi.tampilkanInfo();

        System.out.println();

        Member siti = new Member("Siti Aminah", "MBR-110", 1250000, 240, "Gold");
        System.out.println("Status: Member");
        siti.tampilkanInfo();
    }
}
