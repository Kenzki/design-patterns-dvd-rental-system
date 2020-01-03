public class OldRelease implements Price {

    @Override
    public int getCost(int days) {
        return days * 2;
    }
}
