public class Sugar extends CoffeeDecorator {
    public Sugar(Coffee coffee) {
        super(coffee);
    }
    public String getDescription() {
        return coffee.getDescription() + ", Sugar";
    }
    public double getCost() {
        return coffee.getCost() + 10.00;
    }
}
