package oopchallenge.core;

public class HealthyBurger extends Hamburger {
    private String healthyExtra1Name;
    private double healthyExtra1Price;
    private String healthyExtra2Name;
    private double healthyExtra2Price;

    public HealthyBurger(String meat, double price) {
        super("healthy", meat, price, "whole grain");
    }

    public void addHealthyAddition1(String name, double price) {
        this.healthyExtra1Name = name;
        this.healthyExtra1Price = price;
    }

    public void addHealthyAddition2(String name, double price) {
        this.healthyExtra2Name = name;
        this.healthyExtra2Price = price;
    }

    @Override
    public double itemizeHamburger() {
        double hamburgerPrice = super.itemizeHamburger();

        if (this.healthyExtra1Name != null) {
            hamburgerPrice += this.healthyExtra1Price;
            System.out.printf("%s has been added at at price of $%.2f. \n", this.healthyExtra1Name.toUpperCase(),
                    this.healthyExtra1Price);
        }

        if (this.healthyExtra2Name != null) {
            hamburgerPrice += this.healthyExtra2Price;
            System.out.printf("%s has been added at at price of $%.2f. \n", this.healthyExtra2Name.toUpperCase(),
                    this.healthyExtra2Price);
        }

        if (this.healthyExtra1Name != null || this.healthyExtra2Name != null) {
            System.out.printf("Total price of the hamburger with healthy addition(s) is $%.2f. \n", hamburgerPrice);
        } else {
            System.out.printf("Total price of the hamburger with no healthy addition(s) is $%.2f. \n", hamburgerPrice);
        }
        return hamburgerPrice;

    }

}
