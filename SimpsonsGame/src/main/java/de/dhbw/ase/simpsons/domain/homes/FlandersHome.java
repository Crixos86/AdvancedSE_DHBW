package de.dhbw.ase.simpsons.domain.homes;

public class FlandersHome {
    private final String streetName = "744 Evergreen Terrace";
    private final int numberOfRooms = 8;
    private final int numberOfBathrooms = 4;
    private final int squareFootage = 3500;

    public String getStreetName() {
        return streetName;
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
        System.out.println(streetName + " has " + numberOfRooms + " rooms, " + numberOfBathrooms + " bathrooms and is " + squareFootage + " square feet in size.");
    }

    public void openForTour() {
        System.out.println(streetName + " is open for tour.");
    }
}

