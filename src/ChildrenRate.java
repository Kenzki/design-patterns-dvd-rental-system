public class ChildrenRate implements DVDRateStrategy {

    @Override
    public int getRate(int days) {
        return days * 1;
    }
}
