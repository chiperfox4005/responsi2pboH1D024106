public abstract class KendaraanGalaksi {

    private String namaKendaraan;
    private int levelEnergi;        // 0–100
    private int kapasitasPenumpang;

    public KendaraanGalaksi(String namaKendaraan, int kapasitasPenumpang) {
        this.namaKendaraan = namaKendaraan;
        this.kapasitasPenumpang = kapasitasPenumpang;
        this.levelEnergi = 100;   // default 100%
    }

    public String getNamaKendaraan() {
        return namaKendaraan;
    }

    public int getLevelEnergi() {
        return levelEnergi;
    }

    public int getKapasitasPenumpang() {
        return kapasitasPenumpang;
    }

    protected void setEnergi(int energiBaru) {
        if (energiBaru < 0) energiBaru = 0;
        if (energiBaru > 100) energiBaru = 100;
        this.levelEnergi = energiBaru;
    }

    public final void tampilStatus() {
        System.out.println(
                getNamaKendaraan() +
                        " | Energi: " + getLevelEnergi() + "% | Kapasitas: " +
                        getKapasitasPenumpang() + " orang"
        );
    }

    public abstract void aktifkanMesin();
    public abstract void jelajah(int jarak);
    public abstract void isiEnergi(int jumlah);
}
