package oopchallenge.core;

public class Main {
    public static void main(String[] args) {
        Hamburger hamburger = new Hamburger("basic", "beef", 3.55, "butter");
        // hamburger.itemizeHamburger();
        // hamburger.addHamburgerAddition1("Cheese", 0.55);
        // hamburger.addHamburgerAddition2("Bacon", 0.99);
        // hamburger.itemizeHamburger();

        // DeluxeBurger deluxeBurger = new DeluxeBurger();
        // deluxeBurger.addHamburgerAddition1("bacon", 2.55);
        // deluxeBurger.itemizeHamburger();

        HealthyBurger healthyBurger = new HealthyBurger("chicken", 4.05);
        healthyBurger.itemizeHamburger();

    }
    
}
