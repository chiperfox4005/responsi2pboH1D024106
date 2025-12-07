public class UjiGalaksi {
    public static void main(String[] args) {

        System.out.println("=== UJI SISTEM KENDARAAN GALAKSI ===\n");

        // PESAWAT TEMPUR
        PesawatTempur pesawat = new PesawatTempur("Astra-Fury", 2, 8);

        System.out.println("--- PESAWAT TEMPUR ---");
        pesawat.aktifkanMesin();
        pesawat.jelajah(10);
        pesawat.jelajah(30);
        pesawat.tembakRudal(3);
        pesawat.tampilStatus();

        // KAPAL EKSPLORASI
        System.out.println("\n--- KAPAL EKSPLORASI ---");
        KapalEksplorasi kapal = new KapalEksplorasi("Voyager X", 10, 4);

        kapal.aktifkanMesin();
        kapal.jelajah(15);
        kapal.scanPlanet("Kepler-442b");
        kapal.tampilStatus();
    }
}
