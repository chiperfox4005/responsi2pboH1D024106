public class ProgrammerMagang implements KaryawanKontrak, AksesSistem {

    private String nama;
    private double gajiPerJam;
    private String pinRahasia;
    private boolean sedangLogin;

    public ProgrammerMagang(String nama, double gajiPerJam, String pinRahasia) {
        this.nama = nama;
        this.gajiPerJam = gajiPerJam;
        this.pinRahasia = pinRahasia;
        this.sedangLogin = false;
    }

    @Override
    public double hitungGaji(int jamKerja) {
        double total = jamKerja * gajiPerJam;
        System.out.println("Total gaji: Rp " + total);
        return total;
    }

    @Override
    public void perpanjangKontrak(int durasiBulan) {
        System.out.println("Kontrak diperpanjang selama " + durasiBulan + " bulan.");
    }

    @Override
    public String getStatusCuti() {
        return "Tersedia 5 hari";
    }

    @Override
    public void login(String pin) {
        if (pin.equals(pinRahasia)) {
            sedangLogin = true;
            System.out.println("Login berhasil.");
        } else {
            System.out.println("PIN salah. Login gagal.");
        }
    }

    @Override
    public void logout() {
        sedangLogin = false;
        System.out.println("Logout berhasil.");
    }

    @Override
    public String getRoleAkses() {
        return "Magang IT";
    }
}
