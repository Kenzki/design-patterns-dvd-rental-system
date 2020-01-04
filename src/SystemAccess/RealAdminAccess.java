package SystemAccess;

public class RealAdminAccess implements AdminAccess {
    private String staffName;
    public RealAdminAccess(String StaffName) {
        this.staffName = StaffName;
    }
    @Override
    public void grantAdminAccess(){
        System.out.println("Admin Access granted! Welcome " + staffName);
    }

}
