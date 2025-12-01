public class BrewtifulDemo {
    public static void main(String[] args) {
        System.out.println("=== Brewtiful Coffee Shop ===\n");

        Coffee c1 = new BlackCoffee();
        print("Plain Black Coffee", c1);

        Coffee c2 = new Milk(new Espresso());
        print("Espresso with Milk", c2);

        Coffee c3 = new CaramelSyrup(new Milk(new Espresso()));
        print("Caramel Macchiato Style", c3);

        Coffee c4 = new WhippedCream(new Sugar(new Milk(new BlackCoffee())));
        print("Sweet Creamy Coffee", c4);

        Coffee c5 = new CaramelSyrup(new CaramelSyrup(new Espresso()));
        print("Double Caramel Espresso", c5);
    }

    static void print(String name, Coffee coffee) {
        System.out.println(name + ":");
        System.out.println("   → " + coffee.getDescription());
        System.out.printf("   → ₱%.2f%n%n", coffee.getCost());
    }
}
