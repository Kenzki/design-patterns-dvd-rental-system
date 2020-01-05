package DVDRentalStatus;

public class RentalStatusContext implements State {
    private State rentalState;

    public void setState(State state) {
        this.rentalState=state;
    }
    public State getRentalStatus() {
        return this.rentalState;
    }
    @Override
    public void rentalStatus() {
        this.rentalState.rentalStatus();
    }


}
