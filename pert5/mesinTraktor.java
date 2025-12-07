class mesinTraktor extends defaultMesin {
    double kapasitasTarik;

    mesinTraktor(String nama, int hp, double tarik) {
        super(nama, hp);
        this.kapasitasTarik = tarik;
    }

    @Override
    void tampilInfo() {
        System.out.println("Mesin Traktor " + namaMesin +
                " | Tarik: " + kapasitasTarik + " ton" +
                " | Tenaga: " + tenagaHP + " HP");
    }

    @Override
    double nilaiPerforma() {
        return (tenagaHP * 1.1) + (kapasitasTarik * 5);
    }

    @Override
    String kategoriMesin() {
        return "Mesin Traktor";
    }

    void suaraMesin() {
        System.out.println("GGGRRRR! Hidup mesinnn!");
    }
}
