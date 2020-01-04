import BundleDeal.*;
import SystemAccess.*;

public class Main {

    public static void main(String[] args) {

        AdminAccess access = new ProxyAdminAccess("Kenneth");
        access.grantAdminAccess();

        ProcessRentals processRentals = new ProcessRentals(new ChildrenRate());

        System.out.println("The cost for ChildrenRate DVD is €" + processRentals.executeRate(1));

        processRentals = new ProcessRentals(new OldReleaseRate());
        System.out.println("The cost for Old Release DVD is €" + processRentals.executeRate(1));

        processRentals = new ProcessRentals(new NewReleaseRate());
        System.out.println("The cost for New Release DVD is €" + processRentals.executeRate(1));






    }
}
