package com.dhbw.ase.simpsons.domain.charakters;

import com.dhbw.ase.simpsons.domain.charakters.pictures.LisaPicture;
import com.dhbw.ase.simpsons.domain.homes.EvergreenTerrace;
import com.dhbw.ase.simpsons.domain.luxuryfood.ConsumerGood;
import com.dhbw.ase.simpsons.domain.transport.PersonalTransport;
import com.dhbw.ase.simpsons.domain.workplaces.SpringfieldSchool;

public class Lisa extends SimpsonsCharacter implements CharacterAction {

    public Lisa() {
        super("Lisa", 8, "Student");
    }

    public void playSaxophone() {
        System.out.println(name + " is playing the saxophone.");
    }


    @Override
    public void introduce() {
        System.out.printf("Hi, my name is %s and I am %d years old. I am a %s.", name, age, job);
        printPicture();
        presentHomeAndWorkplace();
        playSaxophone();
        giveQuote();
        lisaFood();
        lisaTransport();
    }

    @Override
    public void printPicture() {
        printPicture(LisaPicture.Picture);
    }

    @Override
    public void presentHomeAndWorkplace() {
        System.out.println("I live in a beautiful home at: \n");
        EvergreenTerrace evergreenTerrace = new EvergreenTerrace();
        evergreenTerrace.listFeatures();
        evergreenTerrace.takeTour();
        System.out.println("I really like to go to: \n");
        SpringfieldSchool springfieldSchool = new SpringfieldSchool();
        springfieldSchool.listInformation();
        springfieldSchool.takeATour();
    }

    @Override
    public void giveQuote() {
        System.out.println("Famous Quote: \"My interests include music, science, justice, animals, shapes, feelings...\"");
    }

    public void lisaFood() {
        ConsumerGood lisaFood = ConsumerGood.TOFU;
        favoriteFood(lisaFood);

    }

    public void lisaTransport() {
        PersonalTransport lisaTransport = PersonalTransport.LISABIKE;
        personalTransport(lisaTransport);
    }
}
