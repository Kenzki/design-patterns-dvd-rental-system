package DVDRentalStatus;

public class RentalStatusActive implements State {
    @Override
    public void rentalStatus(){
        System.out.println("DVD is Rented");
    }
}
