package com.dhbw.ase.simpsons.domain.homes;

public class ApusHome extends Home implements HomeFeatures {
    private final String address = "Unknown";
    private final int numberOfRooms = 4;
    private final int numberOfBathrooms = 2;
    private final int squareFootage = 1500;

    public ApusHome() {
        super("Unknown", 4, 2, 1500);
    }


    @Override
    public void listFeatures() {
        System.out.printf("Apu's home has %d rooms, %d bathrooms and is %d square feet in size.%n", numberOfRooms, numberOfBathrooms, squareFootage);
    }

    @Override
    public void takeTour() {
        System.out.println("Welcome to my humble home.");
    }
}

