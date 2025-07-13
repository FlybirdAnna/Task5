package Decorator;

class SimpleBurger implements Burger {
    public String getDescription() { return "Simple Burger"; }
    public double cost() { return 5.0; }
}