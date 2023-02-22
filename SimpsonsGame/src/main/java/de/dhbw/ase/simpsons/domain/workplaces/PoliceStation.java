package de.dhbw.ase.simpsons.domain.workplaces;

public class PoliceStation {
    private final String name = "Springfield Police Station";
    private final String location = "999 Maple Street";
    private final int numberOfOfficers = 20;
    private final String chief = "Chief Clancy Wiggum";

    public String getName() {
        return name;
    }

    public String getLocation() {
        return location;
    }

    public int getNumberOfOfficers() {
        return numberOfOfficers;
    }

    public String getChief() {
        return chief;
    }

    public void listInformation() {
        System.out.println(name + " located at " + location + " is run by " + chief + " and has " + numberOfOfficers + " officers.");
    }

    public void takeATour() {
        System.out.println("Take a tour of the Springfield Police Station and meet Chief Clancy Wiggum and his officers.");
    }
}

