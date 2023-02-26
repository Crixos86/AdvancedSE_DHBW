package de.dhbw.ase.simpsons.domain.consumergoods;

public class Lemonade {
    private final String name = "Lemonade";
    private final String type = "Drink";
    private final float price = 0.25F;

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public double getPrice() {
        return price;
    }

    public void drink() {
        System.out.println(name + " is drunk.");
    }

    public void throwAway() {
        System.out.println(name + " is thrown away.");
    }
}
