package Decorator;

public class Main {
    public static void main(String[] args) {
        Burger burger = new SimpleBurger();
        burger = new CheeseDecorator(burger);

        System.out.println(burger.getDescription());
        System.out.println("Cost: $" + burger.cost());
    }
}
