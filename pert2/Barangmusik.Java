class BarangMusik {
    String kode;
    String nama;
    double harga;
    int stok;


    BarangMusik(String kode, String nama) {
        this.kode = kode;
        this.nama = nama;
        harga = 0;
        stok = 0;
    }


    BarangMusik(String kode, String nama, double harga) {
        this.kode = kode;
        this.nama = nama;
        this.harga = harga;
        stok = 0;
    }


    BarangMusik(String kode, String nama, double harga, int stok) {
        this.kode = kode;
        this.nama = nama;
        this.harga = harga;
        this.stok = stok;
    }

    void ubahHarga(double hargaBaru) {
        harga = hargaBaru;
    }

    void tambahStok(int jml) {
        stok = stok + jml;
    }

    void tampilInfo() {
        System.out.println("Alat musik " + nama +
                " | Kode: " + kode +
                " | Harga: Rp " + harga +
                " | Stok: " + stok + " unit");
    }
}
