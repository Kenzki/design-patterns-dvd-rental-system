package SystemAccess;

public class ProxyAdminAccess implements AdminAccess {
    private String staffName;
    private RealAdminAccess realAccess;
    public ProxyAdminAccess(String staffName){
        this.staffName = staffName;
    }
    @Override
    public void grantAdminAccess(){
        if(staffName == "David Kenny"){
            realAccess = new RealAdminAccess(staffName);
            realAccess.grantAdminAccess();
        }
        else{
            System.out.println("Admin Access Denied!");
        }
    }
}
