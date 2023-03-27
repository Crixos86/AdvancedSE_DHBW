package com.dhbw.ase.simpsons.domain.workplaces;


public class PoliceStation extends Workplaces implements WorkplaceFeatures {
    private final String name = "Springfield Police Station";
    private final String location = "999 Maple Street";
    private final int numberOfOfficers = 20;
    private final String chief = "Chief Clancy Wiggum";

    public PoliceStation() {
        super("Springfield Police Station", "999 Maple Street", 20, "Chief Clancy Wiggum");
    }

    @Override
    public void listInformation() {
        System.out.printf("%s located at %s, %s is in command and has %d officers.%n", name, location, chief, numberOfOfficers);
    }

    @Override
    public void takeATour() {
        System.out.println("Take a tour of the Springfield Police Station and meet Chief Clancy Wiggum and his officers.");
    }
}

