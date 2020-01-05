public class ChildrenRate implements DVDRate {

    @Override
    public int getRate(int days) {
        return days * 1;
    }
}
