public interface KaryawanKontrak {
    double hitungGaji(int jamKerja);
    void perpanjangKontrak(int durasiBulan);

    default String getStatusCuti() {
        return "Tersedia 12 hari";
    }
}
