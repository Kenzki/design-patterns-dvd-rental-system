package ProcessRentals;

public class ReturningDVD extends ProcessRental {

    @Override
    void execute(){
        System.out.println("Executing DVD return...");
    }

    @Override
    void end(){
        System.out.println("DVD is returned...");
    }
}
