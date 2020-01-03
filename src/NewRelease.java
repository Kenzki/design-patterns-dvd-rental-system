public class NewRelease implements Price{

    @Override
    public int getCost(int days) {
        return days * 3;
    }
}
