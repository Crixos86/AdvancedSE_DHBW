package com.dhbw.ase.simpsons.domain.charakters;

import com.dhbw.ase.simpsons.domain.charakters.pictures.MargePicture;
import com.dhbw.ase.simpsons.domain.homes.EvergreenTerrace;
import com.dhbw.ase.simpsons.domain.luxuryfood.ConsumerGood;
import com.dhbw.ase.simpsons.domain.transport.PersonalTransport;



public class Marge extends SimpsonsCharacter implements CharacterAction {

    public Marge() {
        super("Marge", 34, "Housewife");
    }

    public void bakeCake() {
        System.out.println(name + " is baking a cake.");
    }

    public void careForChildren() {
        System.out.println(name + " is caring for the children.");
    }

    @Override
    public void introduce() {
        System.out.printf("Hi, my name is %s, and I am %d years old. I am a %s.", name, age, job);
        printPicture();
        presentHomeAndWorkplace();
        careForChildren();
        giveQuote();
        bakeCake();
        margeFood();
        margeTransport();
    }

    @Override
    public void printPicture() {
        printPicture(MargePicture.Picture);
    }


    @Override
    public void presentHomeAndWorkplace() {
        System.out.println("I live and work in a beautiful home at: \n");
        EvergreenTerrace evergreenTerrace = new EvergreenTerrace();
        evergreenTerrace.listFeatures();
        evergreenTerrace.takeTour();

    }

    @Override
    public void giveQuote() {
        System.out.println("Famous Quote: \"They just Made A Terrible Life Choice.\"");
    }

    public void margeFood() {
        ConsumerGood margeFood = ConsumerGood.SALAD;
        favoriteFood(margeFood);

    }

    public void margeTransport() {
        PersonalTransport margeTransport = PersonalTransport.MARGECAR;
        personalTransport(margeTransport);
    }
}
