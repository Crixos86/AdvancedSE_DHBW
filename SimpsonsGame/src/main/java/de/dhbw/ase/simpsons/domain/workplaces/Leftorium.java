package de.dhbw.ase.simpsons.domain.workplaces;

public class Leftorium {
    private final String name = "The Leftorium";
    private final String location = "Springfield Mall";
    private final int numberOfProducts = 500;
    private final String owner = "Ned Flanders";

    public String getName() {
        return name;
    }

    public String getLocation() {
        return location;
    }

    public int getNumberOfProducts() {
        return numberOfProducts;
    }

    public String getOwner() {
        return owner;
    }

    public void listInformation() {
        System.out.println(name + " located at " + location + " is owned by " + owner + " and has " + numberOfProducts + " left-handed products.");
    }

    public void takeATour() {
        System.out.println("Take a tour of the Left-Hander's Supply Co. and browse through their extensive collection of left-handed products.");
    }
}
