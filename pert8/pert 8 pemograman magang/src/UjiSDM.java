public class UjiSDM {
    public static void main(String[] args) {

        ProgrammerMagang pm = new ProgrammerMagang("Andi", 50000.0, "1234");

        pm.hitungGaji(160);

        System.out.println(pm.getStatusCuti());

        pm.login("9999");

        pm.login("1234");

        System.out.println(pm.getRoleAkses());

        pm.perpanjangKontrak(6);

        pm.logout();
    }
}
