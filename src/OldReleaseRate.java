public class OldReleaseRate implements DVDRateStrategy {

    @Override
    public int getRate(int days) {
        return days * 2;
    }
}
