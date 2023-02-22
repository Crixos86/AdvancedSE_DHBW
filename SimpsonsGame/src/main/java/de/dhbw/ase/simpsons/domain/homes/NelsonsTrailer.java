package de.dhbw.ase.simpsons.domain.homes;

public class NelsonsTrailer {
    private final String location = "Unknown";
    private final int numberOfRooms = 2;
    private final int numberOfBathrooms = 1;
    private final int squareFootage = 800;

    public String getLocation() {
        return location;
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
        System.out.println("Nelson's trailer has " + numberOfRooms + " rooms, " + numberOfBathrooms + " bathrooms and is " + squareFootage + " square feet in size.");
    }

    public void takeATour() {
        System.out.println("Come and see inside Nelson's home on wheels.");
    }
}

