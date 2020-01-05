package BundleDeal;

public class SnackBundle extends BundleDealDecorator {
    BundleDeal bundleDeal;
    public SnackBundle(BundleDeal bundleDeal){
        this.bundleDeal=bundleDeal;
    }
    public String getDescription(){
        return bundleDeal.getDescription() +",a Snack";

    }
    public double cost(){
        return 2 + bundleDeal.cost();
    }
}
