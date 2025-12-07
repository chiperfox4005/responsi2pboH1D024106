class Manajer extends Karyawan {
    double tunjangan;

    Manajer(String nama, double gajiPokok, double tunjangan) {
        super(nama, gajiPokok);
        this.tunjangan = tunjangan;
    }

    @Override
    void tampilInfo() {
        System.out.println("Nama: " + nama +
                " | Gaji Pokok: Rp " + gajiPokok +
                " | Tunjangan: Rp " + tunjangan);
        System.out.println("Total Pendapatan: Rp " + (gajiPokok + tunjangan));
    }
}
