package com.dhbw.ase.simpsons.domain.charakters;

import com.dhbw.ase.simpsons.domain.charakters.pictures.GuyPicture;
import com.dhbw.ase.simpsons.domain.homes.ComicStore;
import com.dhbw.ase.simpsons.domain.luxuryfood.ConsumerGood;
import com.dhbw.ase.simpsons.domain.transport.PersonalTransport;

public class ComicBookGuy extends SimpsonsCharacter implements CharacterAction {
    public ComicBookGuy() {
        super("Comic Book Guy", 45, "Comic Book Store Owner"  );
    }

    public void workAtComicBookStore() {
        System.out.println(name + " is working at the comic book store.");
    }

    public void makeSnarkyComments() {
        System.out.println(name + " is making snarky comments.");
    }

    @Override
    public void introduce() {
        System.out.printf("Hi, my name is %s, and I am %d years old. I am a %s.", name, age, job);
        printPicture();
        presentHomeAndWorkplace();
        giveQuote();
        protectComics();
        comicFood();
        guyTransport();
    }

    @Override
    public void printPicture() {
        printPicture(GuyPicture.Picture);
    }

    @Override
    public void presentHomeAndWorkplace() {
        workAtComicBookStore();
        ComicStore comicStore = new ComicStore();
        comicStore.listFeatures();
        comicStore.takeTour();
        makeSnarkyComments();
    }

    @Override
    public void giveQuote() {
        System.out.println("Famous Quote: \"I'm not a nerd, I'm a collector of rare and valuable things.\"");
    }

    public void protectComics() {
        System.out.println("He will protect his comics with his life from greasy children's hands!");
    }

    public void comicFood() {
        ConsumerGood comicFood = ConsumerGood.PIZZA;
        favoriteFood(comicFood);

    }

    public void guyTransport() {
        PersonalTransport guyTransport = PersonalTransport.GUYCAR;
        personalTransport(guyTransport);
    }
}
