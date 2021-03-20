package Admin;

public class AdminBeans {

    private String adminUser;
    private String adminPass;
    private String[] Password={"123456"};
    private Object[] adminInfo1={"Anusha","0312-2564789","anusha.makhija@goodhealth.com","DHA phase 2 Street 3 house No.6"};
    private String[] username={"Admin",(String)adminInfo1[0]};

    public String getAdminUser() {
        return adminUser;
    }

    public void setAdminUser(String adminUser) {
        this.adminUser = adminUser;
    }

    public String getAdminPass() {
        return adminPass;
    }

    public void setAdminPass(String adminPass) {
        this.adminPass = adminPass;
    }

    public String[] getPassword() {
        return Password;
    }

    public String[] getUsername() {
        return username;
    }

    public Object[] getAdminInfo1() {
        return adminInfo1;
    }
}
