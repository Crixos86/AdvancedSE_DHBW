package de.dhbw.ase.simpsons.domain.homes;

import de.dhbw.ase.simpsons.application.HomeFeatures;

public class FlandersHome extends Home implements HomeFeatures {
    private final String address = "744 Evergreen Terrace";
    private final int numberOfRooms = 8;
    private final int numberOfBathrooms = 4;
    private final int squareFootage = 3500;

    public FlandersHome() {
        super("744 Evergreen Terrace", 8, 4, 3500);
    }

    @Override
    public void listFeatures() {
        System.out.printf("Ned Flanders' home has %d rooms, %d bathrooms and is %d square feet in size.%n", numberOfRooms, numberOfBathrooms, squareFootage);
    }

    @Override
    public void takeTour() {
        System.out.println("Hi diddly ho neighborinos!");
    }
}

