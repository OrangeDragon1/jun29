package oopchallenge.core;

public class DeluxeBurger extends Hamburger{

    public DeluxeBurger() {
        super("deluxe", "beef & bacon", 19.10, "butter");
        super.addHamburgerAddition1("chips", 0);
        super.addHamburgerAddition2("drink", 0);
    }
    
    @Override
    public void addHamburgerAddition1(String name, double price) {
        System.out.println("Unable to add items to the deluxe burger.");
    }

    @Override
    public void addHamburgerAddition2(String name, double price) {
        System.out.println("Unable to add items to the deluxe burger.");
    }

    @Override
    public void addHamburgerAddition3(String name, double price) {
        System.out.println("Unable to add items to the deluxe burger.");
    }

    @Override
    public void addHamburgerAddition4(String name, double price) {
        System.out.println("Unable to add items to the deluxe burger.");
    }
    
}
