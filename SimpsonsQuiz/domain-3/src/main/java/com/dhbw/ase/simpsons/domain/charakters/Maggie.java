package com.dhbw.ase.simpsons.domain.charakters;

import com.dhbw.ase.simpsons.domain.charakters.pictures.MaggiePicture;
import com.dhbw.ase.simpsons.domain.homes.EvergreenTerrace;
import com.dhbw.ase.simpsons.domain.luxuryfood.ConsumerGood;
import com.dhbw.ase.simpsons.domain.transport.PersonalTransport;

public final class Maggie extends SimpsonsCharacter implements CharacterAction {

    public Maggie() {
        super("Maggie", 1, "Infant");
    }
    public void suckThumb() {
        System.out.println(name + " is sucking her thumb.");
    }

    public void playWithRattle() {
        System.out.println(name + " is playing with a rattle.");
    }

    @Override
    public void introduce() {
        System.out.printf("Hi, my name is %s, and I am %d years old. I am a %s.", name, age, job);
        printPicture();
        presentHomeAndWorkplace();
        suckThumb();
        giveQuote();
        playWithRattle();
        maggieFood();
        maggieTransport();
    }

    @Override
    public void printPicture() {
        printPicture(MaggiePicture.Picture);
    }


    @Override
    public void presentHomeAndWorkplace() {
        System.out.println("I live in a beautiful home at: \n");
        EvergreenTerrace evergreenTerrace = new EvergreenTerrace();
        evergreenTerrace.listFeatures();
        evergreenTerrace.takeTour();
        System.out.println("I do nothing besides playing with my rattle and sucking my thumb.");
    }

    @Override
    public void giveQuote() {
        System.out.println("Famous Quote: \"Tschop Tschop\"");
    }

    public void maggieFood() {
        ConsumerGood maggieFood = ConsumerGood.BOTTLE;
        favoriteFood(maggieFood);

    }

    public void maggieTransport() {
        PersonalTransport maggieTransport = PersonalTransport.MAGGIECAR;
        personalTransport(maggieTransport);
    }
}

