public class NewReleaseRate implements DVDRate {

    @Override
    public int getRate(int days) {
        return days * 3;
    }
}
