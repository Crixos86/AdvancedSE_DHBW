package de.dhbw.ase.simpsons.domain.workplaces;

public class NukularPowerPlant {
    private final String name = "Springfield Nuclear Power Plant";
    private final String location = "1235 Springfield Heights";
    private final int numberOfEmployees = 200;
    private final String owner = "Mr. Burns";

    public String getName() {
        return name;
    }

    public String getLocation() {
        return location;
    }

    public int getNumberOfEmployees() {
        return numberOfEmployees;
    }

    public String getOwner() {
        return owner;
    }

    public void listInformation() {
        System.out.println(name + " located at " + location + " is owned by " + owner + " and has " + numberOfEmployees + " employees.");
    }

    public void takeATour() {
        System.out.println("Take a tour of Springfield's Nuclear Power Plant and see where Homer Simpson works.");
    }
}

