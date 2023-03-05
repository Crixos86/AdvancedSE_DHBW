package de.dhbw.ase.simpsons.domain.homes;

import de.dhbw.ase.simpsons.application.HomeFeatures;

public class EvergreenTerrace extends Home implements HomeFeatures {
    private final String address = "Evergreen Terrace";
    private final int numberOfRooms = 6;
    private final int numberOfBathrooms = 2;
    private final int squareFootage = 2200;

    public EvergreenTerrace() {
        super("Evergreen Terrace", 6, 2, 2200);
    }


    @Override
    public void listFeatures() {
        System.out.printf("Evergreen Terrace has %d rooms, %d bathrooms and is %d square feet in size.%n", numberOfRooms, numberOfBathrooms, squareFootage);
    }

    @Override
    public void takeTour() {
        System.out.println("Evergreen Terrace is a nice place to live.");
    }
}

