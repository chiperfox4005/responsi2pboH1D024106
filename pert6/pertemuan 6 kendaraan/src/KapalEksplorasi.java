public class KapalEksplorasi extends KendaraanGalaksi {

    private int modulScan;

    public KapalEksplorasi(String nama, int kapasitas, int modulScan) {
        super(nama, kapasitas);
        this.modulScan = modulScan;
    }

    @Override
    public void aktifkanMesin() {
        if (getLevelEnergi() < 15) {
            System.out.println("Energi tidak mencukupi untuk memulai ekspedisi!");
        } else {
            System.out.println("Kapal eksplorasi siap berangkat!");
        }
    }

    @Override
    public void jelajah(int jarak) {
        int konsumsi = jarak * 2; // 2% per km
        if (getLevelEnergi() < konsumsi) {
            System.out.println("Energi tidak cukup untuk menjelajah sejauh " + jarak + " km.");
        } else {
            setEnergi(getLevelEnergi() - konsumsi);
            System.out.println("Kapal eksplorasi menjelajah sejauh " + jarak + " km.");
        }
    }

    @Override
    public void isiEnergi(int jumlah) {
        setEnergi(getLevelEnergi() + jumlah);
        System.out.println("Energi kapal bertambah.");
    }

    public void scanPlanet(String namaPlanet) {
        System.out.println("Melakukan scan pada planet " + namaPlanet +
                " dengan modul level " + modulScan + ".");
    }
}
