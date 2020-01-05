import BundleDeal.*;
import DVDRentalStatus.*;
import Member.Member;
import Newsletters.Newsletter;
import Newsletters.Observer;
import SystemAccess.*;

public class Main {

    public static void main(String[] args) {

        AdminAccess access = new ProxyAdminAccess("David Kenny");
        access.grantAdminAccess();

        ProcessRentals processRentals = new ProcessRentals(new ChildrenRate());

        System.out.println("The cost for ChildrenRate DVD is €" + processRentals.executeRate(1));

        processRentals = new ProcessRentals(new OldReleaseRate());
        System.out.println("The cost for Old Release DVD is €" + processRentals.executeRate(1));

        processRentals = new ProcessRentals(new NewReleaseRate());
        System.out.println("The cost for New Release DVD is €" + processRentals.executeRate(1));


        Member michael = new Member("Michael", "michael@gmail.com", "Dublin");

        Newsletter news = new Newsletter();
        news.registerObserver(michael);
        news.setNews("Marvel, Starwars, Etc..");

        RentalStatusContext context = new RentalStatusContext();
        State rentalStatusActive = new RentalStatusActive();
        State rentalStatusInactive = new RentalStatusInactive();
        State rentalStatusUnavailable = new RentalStatusUnavailable();

        context.setState(rentalStatusActive);
        context.rentalStatus();

        context.setState(rentalStatusInactive);
        context.rentalStatus();

        context.setState(rentalStatusUnavailable);
        context.rentalStatus();






    }
}
