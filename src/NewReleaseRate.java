public class NewReleaseRate implements DVDRateStrategy {

    @Override
    public int getRate(int days) {
        return days * 3;
    }
}
