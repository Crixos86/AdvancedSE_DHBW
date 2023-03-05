package de.dhbw.ase.simpsons.domain.workplaces;

import de.dhbw.ase.simpsons.application.WorkplaceFeatures;

public class Leftorium extends Workplaces implements WorkplaceFeatures {
    private final String name = "The Leftorium";
    private final String location = "Springfield Mall";
    private int numberOfProducts = 500;
    private final String owner = "Ned Flanders";

    public Leftorium() {
        super("The Leftorium", "Springfield Mall", 500, "Ned Flanders");
    }


    @Override
    public void listInformation() {
        System.out.printf("%s located at %s is owned by %s and has %d products.%n", name, location, owner, numberOfProducts);
    }

    @Override
    public void takeATour() {
        System.out.println("Take a tour of the Leftorium and meet Ned Flanders and his employees.");
    }
}
