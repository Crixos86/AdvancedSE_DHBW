package de.dhbw.ase.simpsons.domain.homes;

public class ApusHome {
    private final String address = "Unknown";
    private final int numberOfRooms = 4;
    private final int numberOfBathrooms = 2;
    private final int squareFootage = 1500;

    public String getAddress() {
        return address;
    }

    public int getNumberOfRooms() {
        return numberOfRooms;
    }

    public int getNumberOfBathrooms() {
        return numberOfBathrooms;
    }

    public int getSquareFootage() {
        return squareFootage;
    }

    public void listFeatures() {
        System.out.println("Apu's home has " + numberOfRooms + " rooms, " + numberOfBathrooms + " bathrooms and is " + squareFootage + " square feet in size.");
    }

    public void takeATour() {
        System.out.println("Come and see the luxurious home of Springfield's favorite Kwik-E-Mart owner, Apu.");
    }
}

