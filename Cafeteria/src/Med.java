public class Med extends SizeDecorator {
    Beverage beverage;
    
    public Med(Beverage beverage) {
        this.beverage = beverage;
    }
    
    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Med";
    }
    
    @Override
    public double cost() {
        return beverage.cost() +  (beverage.cost() * 0.5 );
    }
}