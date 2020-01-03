public class ProcessRentals {
    private DVDRateStrategy DVDRateStrategy;

    public ProcessRentals(DVDRateStrategy DVDRateStrategy){
        this.DVDRateStrategy = DVDRateStrategy;
    }

    public int executeRate(int days){
        return DVDRateStrategy.getRate(days);
    }
}
