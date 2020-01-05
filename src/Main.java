import BundleDeal.*;
import DVDRentalStatus.*;
import Member.Member;
import Newsletters.Newsletter;
import SystemAccess.*;
import ProcessRentals.*;

public class Main {

    public static void main(String[] args) {

        AdminAccess access = new ProxyAdminAccess("David Kenny");
        access.grantAdminAccess();

        DVDRentalRate processRentals = new DVDRentalRate(new ChildrenRate());

        System.out.println("\nThe cost for ChildrenRate DVD is €" + processRentals.executeRate(1));

        processRentals = new DVDRentalRate(new OldReleaseRate());
        System.out.println("The cost for Old Release DVD is €" + processRentals.executeRate(1));

        processRentals = new DVDRentalRate(new NewReleaseRate());
        System.out.println("The cost for New Release DVD is €" + processRentals.executeRate(1) + "\n");


        Member michael = new Member("Michael", "michael@gmail.com", "Dublin");

        Newsletter news = new Newsletter();
        news.registerObserver(michael);
        news.setNews("Marvel, Starwars, Etc..\n");

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

        BundleDeal newRelease = new NewRelease();
        System.out.println("\n" + newRelease.getDescription()
                + " is €" + newRelease.cost());


        BundleDeal bundleNewRelease = new NewRelease();
        bundleNewRelease = new SnackBundle(bundleNewRelease);
        bundleNewRelease = new DrinkBundle(bundleNewRelease);
        System.out.println(bundleNewRelease.getDescription()
        + " are €" + bundleNewRelease.cost()+ "\n");

        ProcessRental rentingDVD = new RentingDVD();
        ProcessRental returningDVD = new ReturningDVD();
        rentingDVD.process();
        returningDVD.process();


    }
}
