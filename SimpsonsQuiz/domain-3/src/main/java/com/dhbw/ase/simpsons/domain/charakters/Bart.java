package com.dhbw.ase.simpsons.domain.charakters;

import com.dhbw.ase.simpsons.domain.charakters.pictures.BartPicture;
import com.dhbw.ase.simpsons.domain.homes.EvergreenTerrace;
import com.dhbw.ase.simpsons.domain.luxuryfood.ConsumerGood;
import com.dhbw.ase.simpsons.domain.transport.PersonalTransport;
import com.dhbw.ase.simpsons.domain.workplaces.SpringfieldSchool;

public class Bart extends SimpsonsCharacter implements CharacterAction {

    public Bart() {
        super("Bart", 10, "Student");
    }

    public void playPranks() {
        System.out.println(name + " favourite hobby is playing pranks.");
    }


    @Override
    public void introduce() {
        System.out.printf("Hi, my name is %s, and I am %d years old. I am a %s.", name, age, job);
        playPranks();
        printPicture();
        presentHomeAndWorkplace();
        giveQuote();
        bartFood();
        bartTransport();
    }

    @Override
    public void presentHomeAndWorkplace() {
        System.out.println("I live in a beautiful home at: \n");
        EvergreenTerrace evergreenTerrace = new EvergreenTerrace();
        evergreenTerrace.listFeatures();
        evergreenTerrace.takeTour();
        System.out.println("I have to go to: \n");
        SpringfieldSchool springfieldSchool = new SpringfieldSchool();
        springfieldSchool.listInformation();
        springfieldSchool.takeATour();
    }

    @Override
    public void giveQuote() {
        System.out.println("Famous Quote: \"I didn't do it, nobody saw me do it, there's no way you can prove anything!\"");
    }

    @Override
    public void printPicture() {
        printPicture(BartPicture.Picture);
    }

    public void bartFood() {
        ConsumerGood bartFood = ConsumerGood.SQUISHY;
        favoriteFood(bartFood);

    }

    public void bartTransport() {
        PersonalTransport bartTransport = PersonalTransport.BARTBOARD;
        personalTransport(bartTransport);
    }

}
