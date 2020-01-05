public class DVDRentalRate {
    private DVDRate DVDRateStrategy;

    public DVDRentalRate(DVDRate DVDRateStrategy){
        this.DVDRateStrategy = DVDRateStrategy;
    }

    public int executeRate(int days){
        return DVDRateStrategy.getRate(days);
    }
}
