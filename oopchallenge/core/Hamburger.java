package oopchallenge.core;

public class Hamburger {
    private double price;
    private String name;
    private String meat;
    private String breadRollType;

    private String addition1Name;
    private double addition1Price;
    private String addition2Name;
    private double addition2Price;
    private String addition3Name;
    private double addition3Price;
    private String addition4Name;
    private double addition4Price;

    public Hamburger(String name, String meat, double price, String breadRollType) {
        this.price = price;
        this.name = name;
        this.meat = meat;
        this.breadRollType = breadRollType;
    }

    public void addHamburgerAddition1(String name, double price) {
        this.addition1Name = name;
        this.addition1Price = price;
    }

    public void addHamburgerAddition2(String name, double price) {
        this.addition2Name = name;
        this.addition2Price = price;
    }

    public void addHamburgerAddition3(String name, double price) {
        this.addition3Name = name;
        this.addition3Price = price;
    }

    public void addHamburgerAddition4(String name, double price) {
        this.addition4Name = name;
        this.addition4Price = price;
    }

    public double itemizeHamburger() {
        double hamburgerPrice = this.price;
        System.out.printf("The %s burger has a %s roll and %s patty with a base price of $%.2f. \n", this.name,
                this.breadRollType, this.meat, this.price);
        if (this.addition1Name != null) {
            hamburgerPrice += this.addition1Price;
            System.out.printf("%s has been added at at price of $%.2f. \n", this.addition1Name.toUpperCase(),
                    this.addition1Price);
        }

        if (this.addition2Name != null) {
            hamburgerPrice += this.addition2Price;
            System.out.printf("%s has been added at at price of $%.2f. \n", this.addition2Name.toUpperCase(),
                    this.addition2Price);
        }

        if (this.addition3Name != null) {
            hamburgerPrice += this.addition3Price;
            System.out.printf("%s has been added at at price of $%.2f. \n", this.addition3Name.toUpperCase(),
                    this.addition3Price);
        }

        if (this.addition4Name != null) {
            hamburgerPrice += this.addition4Price;
            System.out.printf("%s has been added at at price of $%.2f. \n", this.addition4Name.toUpperCase(),
                    this.addition4Price);
        }

        if (this.addition1Name != null || this.addition2Name != null || this.addition3Name != null
                || this.addition4Name != null) {
            System.out.printf("Total price of the hamburger with addition(s) is $%.2f. \n", hamburgerPrice);
        } else {
            System.out.printf("Total price of the hamburger with no addition(s) is $%.2f. \n", hamburgerPrice);
        }
        return hamburgerPrice;
    }
}
