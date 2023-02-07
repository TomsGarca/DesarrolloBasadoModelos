public class Ch extends SizeDecorator {
    Beverage beverage;
    
    public Ch(Beverage beverage) {
        this.beverage = beverage;
    }
    
    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Ch";
    }
    
    @Override
    public double cost() {
        return beverage.cost();
    }
}