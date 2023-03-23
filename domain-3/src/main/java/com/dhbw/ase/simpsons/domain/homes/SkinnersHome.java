package com.dhbw.ase.simpsons.domain.homes;


public class SkinnersHome extends Home implements HomeFeatures {
    private final String address = "330 Pikeland Avenue";
    private int numberOfRooms = 3;
    private int numberOfBathrooms = 1;
    private int squareFootage = 1200;

    public SkinnersHome() {
        super("330 Pikeland Avenue", 3, 1, 1200);
    }


    @Override
    public void listFeatures() {
        System.out.printf("Seymour Skinner's home has %d rooms, %d bathrooms and is %d square feet in size.%n", numberOfRooms, numberOfBathrooms, squareFootage);
    }

    @Override
    public void takeTour() {
        System.out.println("Seymour Skinner's home is a nice litte home but it smells a bit like old people.");
    }
}

