package DVDRentalStatus;

public class RentalStatusInactive implements State {
    @Override
    public void rentalStatus(){
        System.out.println("DVD is not Rented");
    }
}
