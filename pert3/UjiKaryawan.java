class UjiKaryawan {
    public static void main(String[] args) {

        System.out.println("=== DATA KARYAWAN TECHMAJU ===");

        Karyawan budi = new Karyawan("Budi Santoso", 4000000);
        System.out.println("Status: Karyawan Biasa");
        budi.tampilInfo();

        System.out.println();

        Manajer siti = new Manajer("Siti Aminah", 6000000, 2500000);
        System.out.println("Status: Manajer");
        siti.tampilInfo();
    }
}
