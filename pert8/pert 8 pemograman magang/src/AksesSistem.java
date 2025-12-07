public interface AksesSistem {
    void login(String pin);
    void logout();

    default String getRoleAkses() {
        return "Staff Biasa";
    }
}
