package de.dhbw.ase.simpsons.domain.homes;

public class ComicStore {
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

    public void listInventory() {
        System.out.println(name + " has " + numberOfComics + " comics and " + numberOfCollectibles + " collectibles in stock.");
    }

    public void sellComic(int number) {
        if (numberOfComics >= number) {
            numberOfComics -= number;
            System.out.println(number + " comics have been sold.");
        } else {
            System.out.println("Not enough comics in stock to fulfill the request.");
        }
    }
}

