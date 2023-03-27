package com.dhbw.ase.simpsons.domain.homes;


public class NelsonsTrailer extends Home implements HomeFeatures {
    private final String address = "Unknown";
    private final int numberOfRooms = 2;
    private final int numberOfBathrooms = 1;
    private final int squareFootage = 800;

    public NelsonsTrailer() {
        super("Unknown", 2, 1, 800);
    }

    @Override
    public void listFeatures() {
        System.out.printf("Nelson's trailer has %d rooms, %d bathrooms and is %d square feet in size.%n", numberOfRooms, numberOfBathrooms, squareFootage);
    }

    @Override
    public void takeTour() {
        System.out.println("In Nelson's trailer you will be greeted with a hearty underpants ripper");
    }
}
