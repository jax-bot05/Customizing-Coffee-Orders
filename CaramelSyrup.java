public class CaramelSyrup extends CoffeeDecorator {
    public CaramelSyrup(Coffee coffee) {
        super(coffee);
    }
    public String getDescription() {
        return coffee.getDescription() + ", Caramel Syrup";
    }
    public double getCost() {
        return coffee.getCost() + 40.00;
    }
}
