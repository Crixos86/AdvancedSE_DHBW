package de.dhbw.ase.simpsons.domain.homes;

public class SkinnersHome {
    private final String address = "330 Pikeland Avenue";
    private final int numberOfRooms = 3;
    private final int numberOfBathrooms = 1;
    private final int squareFootage = 1200;
    private final String mother = "Agnes Skinner";

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

    public String getMother() {
        return mother;
    }

    public void listFeatures() {
        System.out.println(address + " has " + numberOfRooms + " rooms, " + numberOfBathrooms + " bathrooms, is " + squareFootage + " square feet in size and is lived in by " + mother + " and Seymour Skinner.");
    }

    public void takeATour() {
        System.out.println("Take a tour of Seymour Skinner's childhood home, now shared with his mother " + mother + ".");
    }
}

