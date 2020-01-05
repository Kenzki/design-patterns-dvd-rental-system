public class DVDRentalRate {
    private DVDRateStrategy DVDRateStrategy;

    public DVDRentalRate(DVDRateStrategy DVDRateStrategy){
        this.DVDRateStrategy = DVDRateStrategy;
    }

    public int executeRate(int days){
        return DVDRateStrategy.getRate(days);
    }
}
