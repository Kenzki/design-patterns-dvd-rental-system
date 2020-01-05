package BundleDeal;

public class DrinkBundle extends BundleDealDecorator {
    BundleDeal bundleDeal;
    public DrinkBundle(BundleDeal bundleDeal){
        this.bundleDeal=bundleDeal;

    }
    public String getDescription(){
        return bundleDeal.getDescription()+ ",a Drink";
    }
    public double cost(){
        return 3 + bundleDeal.cost();
    }
}
