public class ProcessRentals {
    private Price price;

    public ProcessRentals(Price price){
        this.price = price;
    }

    public int executePrice(int days){
        return price.getCost(days);
    }
}
