public class OldReleaseRate implements DVDRate {

    @Override
    public int getRate(int days) {
        return days * 2;
    }
}
