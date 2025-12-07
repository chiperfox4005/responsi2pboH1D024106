class Pengguna {
    int umur;
    double berat;
    double tinggi;

    // konstanta (gak bisa diubah)
    final double faktorAktivitas = 1.2;

    double hitungBMI() {
        double t = tinggi / 100;
        return berat / (t * t);
    }

    void tampilKategori() {
        double bmi = hitungBMI();
        if (bmi < 18.5) {
            System.out.println("Kategori: Kurus");
        } else if (bmi < 25) {
            System.out.println("Kategori: Normal");
        } else {
            System.out.println("Kategori: Obesitas");
        }
    }

    double hitungKalori() {
        return berat * faktorAktivitas * 10;
    }

    void tampilInfo() {
        System.out.println("=== Informasi Kesehatan Pengguna ===");
        System.out.println("Umur: " + umur);
        System.out.println("Berat: " + berat);
        System.out.println("Tinggi: " + tinggi);
        System.out.printf("BMI: %.2f\n", hitungBMI());
        tampilKategori();
        System.out.println("Kebutuhan Kalori: " + (int)hitungKalori());
        System.out.println("====================================");
    }
}
