package de.dhbw.ase.simpsons.domain.consumergoods;

public class Donuts {

    private final String name = "Donuts";
    private final String type = "Food";
    private final float price = 0.50F;

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public double getPrice() {
        return price;
    }

    public void eat() {
        System.out.println(name + " is eaten.");
    }

    public void throwAway() {
        System.out.println(name + " is thrown away.");
    }
}
