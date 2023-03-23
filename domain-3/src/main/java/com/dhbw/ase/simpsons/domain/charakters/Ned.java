package com.dhbw.ase.simpsons.domain.charakters;

import com.dhbw.ase.simpsons.domain.charakters.pictures.NedPicture;
import com.dhbw.ase.simpsons.domain.homes.FlandersHome;
import com.dhbw.ase.simpsons.domain.luxuryfood.ConsumerGood;
import com.dhbw.ase.simpsons.domain.transport.PersonalTransport;
import com.dhbw.ase.simpsons.domain.workplaces.Leftorium;


public class Ned extends SimpsonsCharacter implements CharacterAction {

    public Ned() {
        super("Ned", 42, "Homer's Neighbor and Prayer");
    }

    public void praying() {
        System.out.println(name + " is praying.");
    }

    public void beFriendly() {
        System.out.println(name + " is being friendly.");
    }

    @Override
    public void introduce() {
        System.out.printf("Hi, my name is %s and I am %d years old. I am a %s.", name, age, job);
        printPicture();
        praying();
        presentHomeAndWorkplace();
        beFriendly();
        giveQuote();
        nedFood();
        nedTransport();
    }

    @Override
    public void printPicture() {
        printPicture(NedPicture.Picture);
    }


    @Override
    public void presentHomeAndWorkplace() {
        System.out.println("I live in a beautiful home at: \n");
        FlandersHome flandersHome = new FlandersHome();
        flandersHome.listFeatures();
        flandersHome.takeTour();
        System.out.println("I work at a diddely lovely store: \n");
        Leftorium leftorium = new Leftorium();
        leftorium.listInformation();
        leftorium.takeATour();
    }

    @Override
    public void giveQuote() {
        System.out.println("Famous Quote: \"Hi diddly ho neighborino.\"");
    }

    public void nedFood() {
        ConsumerGood nedFood = ConsumerGood.BREAD;
        favoriteFood(nedFood);

    }

    public void nedTransport() {
        PersonalTransport nedTransport = PersonalTransport.NEDCAR;
        personalTransport(nedTransport);
    }
}