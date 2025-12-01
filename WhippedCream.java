public class WhippedCream extends CoffeeDecorator {
    public WhippedCream(Coffee coffee) {
        super(coffee);
    }
    public String getDescription() {
        return coffee.getDescription() + ", Whipped Cream";
    }
    public double getCost() {
        return coffee.getCost() + 35.00;
    }
}
