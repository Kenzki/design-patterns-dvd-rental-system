package ProcessRentals;

public class RentingDVD extends ProcessRental {

    @Override
    void execute(){
        System.out.println("Executing DVD Rental...checking if its available");
    }

    @Override
    void end(){
        System.out.println("DVD is rented.....");
    }
}
