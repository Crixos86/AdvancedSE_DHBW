package de.dhbw.ase.simpsons.domain.homes;

public class EvergreenTerrace {
    private final String streetName = "Evergreen Terrace";
    private final int numberOfRooms = 6;
    private final int numberOfBathrooms = 2;
    private final int squareFootage = 2200;

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
}

