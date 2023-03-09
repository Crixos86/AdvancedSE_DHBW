package de.dhbw.ase.simpsons.domain.workplaces;


import de.dhbw.ase.simpsons.application.WorkplaceFeatures;

public  class NukularPowerPlant extends Workplaces implements WorkplaceFeatures {
    private final String name = "Springfield Nuclear Power Plant";
    private final String location = "1235 Springfield Heights";
    private final int numberOfEmployees = 200;
    private final String owner = "Mr. Burns";

    public NukularPowerPlant() {
        super("Springfield Nuclear Power Plant", "1235 Springfield Heights", 200, "Mr. Burns");
    }


    @Override
    public void listInformation() {
        System.out.printf("%s located at %s is owned by %s and has %d employees.%n", name, location, owner, numberOfEmployees);
    }

    @Override
    public void takeATour() {
        System.out.println("Take a tour of the Springfield Nuclear Power Plant and meet Mr. Burns and his employees. Days since the last accident: 0");
    }
}

