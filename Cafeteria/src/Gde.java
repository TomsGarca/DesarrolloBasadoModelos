public class Gde extends SizeDecorator {
    Beverage beverage;
    
    public Gde(Beverage beverage) {
        this.beverage = beverage;
    }
    
    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Gde";
    }
    
    @Override
    public double cost() {
        return beverage.cost() +  beverage.cost();
    }
}