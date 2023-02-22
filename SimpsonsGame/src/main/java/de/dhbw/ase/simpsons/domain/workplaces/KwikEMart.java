package de.dhbw.ase.simpsons.domain.workplaces;

public class KwikEMart {
    private final String name = "Kwik-E-Mart";
    private final String location = "711 Evergreen Terrace";
    private final int numberOfEmployees = 5;
    private final String owner = "Apu Nahasapeemapetilon";

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
        System.out.println("Take a tour of Springfield's favorite convenience store, the Kwik-E-Mart, and see where Apu Nahasapeemapetilon works.");
    }
}

