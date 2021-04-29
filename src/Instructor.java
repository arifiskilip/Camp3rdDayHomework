public class Instructor extends User{
    private String  adminId;
    private String adminPassword;

    public Instructor()
    {

    }

    public Instructor(String adminId, String adminPassword) {
        this.setAdminId(adminId);
        this.setAdminPassword(adminPassword);
    }


    public String getAdminId() {
        return adminId;
    }

    public void setAdminId(String adminId) {
        this.adminId = adminId;
    }

    public String getAdminPassword() {
        return adminPassword;
    }

    public void setAdminPassword(String adminPassword) {
        this.adminPassword = adminPassword;
    }
}
