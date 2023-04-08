package com.dhbw.ase.simpsons.domain.charakters;

import com.dhbw.ase.simpsons.domain.charakters.pictures.HomerPicture;
import com.dhbw.ase.simpsons.domain.homes.EvergreenTerrace;
import com.dhbw.ase.simpsons.domain.luxuryfood.ConsumerGood;
import com.dhbw.ase.simpsons.domain.transport.PersonalTransport;
import com.dhbw.ase.simpsons.domain.workplaces.NukularPowerPlant;

public final class Homer extends SimpsonsCharacter implements CharacterAction {

    public Homer() {
        super("Homer", 36, "Safety Inspector");
    }

    public void correctWorkplace() {
        System.out.println(name + " says: It is pronounced 'Nukular'!");
    }

    @Override
    public void introduce() {
        System.out.printf("Hi, my name is %s, and I am %d years old. I am a %s.", name, age, job);
        printPicture();
        presentHomeAndWorkplace();
        giveQuote();
        homerFood();
        homerTransport();
    }

    @Override
    public void printPicture() {
        printPicture(HomerPicture.Picture);
    }

    @Override
    public void presentHomeAndWorkplace() {
        System.out.println("I live in a beautiful home at: \n");
        EvergreenTerrace evergreenTerrace = new EvergreenTerrace();
        evergreenTerrace.listFeatures();
        evergreenTerrace.takeTour();
        System.out.println("I am the Safety Inspector at: \n");
        NukularPowerPlant nukularPowerPlant = new NukularPowerPlant();
        nukularPowerPlant.listInformation();
        nukularPowerPlant.takeATour();
        correctWorkplace();

    }

    @Override
    public void giveQuote() {
        System.out.println("Famous Quote: \"D'oh!\"");
    }

    public void homerFood() {
        ConsumerGood homerFood = ConsumerGood.DONUT;
        favoriteFood(homerFood);

    }

    public void homerTransport() {
        PersonalTransport homerTransport = PersonalTransport.HOMERCAR;
        personalTransport(homerTransport);
    }
}
