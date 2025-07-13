package Decorator;

class CheeseDecorator implements Burger {
    private final Burger burger;

    public CheeseDecorator(Burger burger) {
        this.burger = burger;
    }

    public String getDescription() {
        return burger.getDescription() + ", Cheese";
    }

    public double cost() {
        return burger.cost() + 0.5;
    }
}