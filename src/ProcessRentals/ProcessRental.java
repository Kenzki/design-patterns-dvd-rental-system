package ProcessRentals;

public abstract class ProcessRental {
    abstract void execute();
    abstract void end();

    public final void process(){
        execute();
        end();
    }
}
