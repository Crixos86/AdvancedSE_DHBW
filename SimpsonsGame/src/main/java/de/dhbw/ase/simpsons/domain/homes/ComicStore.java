package de.dhbw.ase.simpsons.domain.homes;

import de.dhbw.ase.simpsons.application.HomeFeatures;

public class ComicStore implements HomeFeatures {
    private final String name = "The Android's Dungeon & Baseball Card Shop";
    private int numberOfComics = 10000;
    private final int numberOfCollectibles = 5000;

    public String getName() {
        return name;
    }

    public int getNumberOfComics() {
        return numberOfComics;
    }

    public int getNumberOfCollectibles() {
        return numberOfCollectibles;
    }


    @Override
    public void listFeatures() {
        System.out.println(name + " has " + numberOfComics + " comics and " + numberOfCollectibles + " collectibles in stock.");
    }

    @Override
    public void takeTour() {
        System.out.println("Welcome to " + name + ". We have a wide variety of comics and collectibles.");
    }
}

