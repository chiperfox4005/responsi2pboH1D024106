class Member extends Customer {

    int poin;
    String level;

    Member(String nama, String id, int totalBelanja, int poin, String level) {
        super(nama, id, totalBelanja);
        this.poin = poin;
        this.level = level;
    }

    @Override
    void tampilkanInfo() {
        super.tampilkanInfo();
        System.out.println("Poin Reward: " + poin + " | Level: " + level);
    }
}
