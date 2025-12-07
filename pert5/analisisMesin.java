class analisisMesin {
    public static void main(String[] args) {

        // Array menampung berbagai jenis mesin
        defaultMesin[] daftar = new defaultMesin[5];

        // Data contoh
        daftar[0] = new mesinMotor("Honda Supra X", 125, "Bebek");
        daftar[1] = new mesinTraktor("Kubota MX5200", 520, 4.5);
        daftar[2] = new mesinTraktorListrik("EcoTrac Z900", 300, 4.2, 70);
        daftar[3] = new mesinMotor("Yamaha R25", 250, "Sport");
        daftar[4] = new mesinTraktorListrik("Volta FarmX", 300, 3.5, 80);

        System.out.println("=== DATA MESIN MEGATECH ===");

        // Menampilkan info dasar tiap mesin
        for (defaultMesin m : daftar) {
            m.tampilInfo();
            System.out.println("Kategori : " + m.kategoriMesin());
            System.out.println("Performa : " + m.nilaiPerforma());
            System.out.println();
        }

        System.out.println("=== SUARA MESIN ===");

        // Menampilkan suara lewat instanceof
        for (defaultMesin m : daftar) {
            System.out.print(m.namaMesin + " -> ");
            if (m instanceof mesinMotor) {
                ((mesinMotor)m).suaraMesin();
            } else if (m instanceof mesinTraktorListrik) {
                ((mesinTraktorListrik)m).suaraMesin();
            } else if (m instanceof mesinTraktor) {
                ((mesinTraktor)m).suaraMesin();
            } else {
                System.out.println("-");
            }
        }

        System.out.println("\n=== MESIN PERFORMA TERTINGGI ===");

        defaultMesin terbaik = daftar[0];
        for (defaultMesin m : daftar) {
            if (m.nilaiPerforma() > terbaik.nilaiPerforma()) {
                terbaik = m;
            }
        }
        System.out.println(terbaik.namaMesin + " -> " + terbaik.nilaiPerforma());

        System.out.println("\n=== TOP 3 MESIN TERBAIK ===");

        // Sort sederhana (bubble)
        for (int i = 0; i < daftar.length - 1; i++) {
            for (int j = i + 1; j < daftar.length; j++) {
                if (daftar[j].nilaiPerforma() > daftar[i].nilaiPerforma()) {
                    defaultMesin temp = daftar[i];
                    daftar[i] = daftar[j];
                    daftar[j] = temp;
                }
            }
        }

        // Print 3 terbesar
        for (int i = 0; i < 3; i++) {
            System.out.println((i+1) + ". " + daftar[i].namaMesin +
                    " -> " + daftar[i].nilaiPerforma());
        }
    }
}
