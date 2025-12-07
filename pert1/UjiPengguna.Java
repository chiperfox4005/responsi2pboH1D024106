
class UjiPengguna {
    public static void main(String[] args) {
        Pengguna p = new Pengguna();
        p.umur = 25;
        p.berat = 60;
        p.tinggi = 170;

        p.tampilInfo();

        System.out.println("\n--- Demo Final ---");
        System.out.println("faktorAktivitas = " + p.faktorAktivitas);
        System.out.println("Nilai ini final, jadi gak bisa diganti.");
        System.out.println("Contoh:");
        System.out.println("p.faktorAktivitas = 1.5;  // ERROR");
    }
}
