package SystemAccess;

import org.junit.Test;

import static org.junit.Assert.*;

public class AdminAccessTest {

    @Test
    public void grantAdminAccessGranted() {
        AdminAccess access = new ProxyAdminAccess("David Kenny");
        access.grantAdminAccess();
    }

    @Test
    public void grantAdminAccessDenied() {
        AdminAccess access = new ProxyAdminAccess("Michael Devlin");
        access.grantAdminAccess();
    }
}