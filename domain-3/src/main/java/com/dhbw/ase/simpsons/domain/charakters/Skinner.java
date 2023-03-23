package com.dhbw.ase.simpsons.domain.charakters;

import com.dhbw.ase.simpsons.domain.charakters.pictures.SkinnerPicture;
import com.dhbw.ase.simpsons.domain.homes.SkinnersHome;
import com.dhbw.ase.simpsons.domain.luxuryfood.ConsumerGood;
import com.dhbw.ase.simpsons.domain.transport.PersonalTransport;
import com.dhbw.ase.simpsons.domain.workplaces.SpringfieldSchool;

public class Skinner extends SimpsonsCharacter implements CharacterAction {
    public Skinner() {
        super("Skinner", 54, "School Principal");
    }
    public void workAsPrincipal() {
        System.out.println(name + " is working as the school principal.");
    }

    public void disciplineStudents() {
        System.out.println(name + " is disciplining students.");
    }

    @Override
    public void introduce() {
        System.out.printf("Hi, my name is %s and I am %d years old. I am a %s.", name, age, job);
        printPicture();
        presentHomeAndWorkplace();
        disciplineStudents();
        giveQuote();
        skinnerFood();
        skinnerTransport();
    }

    @Override
    public void printPicture() {
        printPicture(SkinnerPicture.Picture);
    }

    @Override
    public void presentHomeAndWorkplace() {
        System.out.println("I live in a beautiful home at: \n");
        SkinnersHome skinnersHome = new SkinnersHome();
        skinnersHome.listFeatures();
        skinnersHome.takeTour();
        workAsPrincipal();
        SpringfieldSchool springfieldSchool = new SpringfieldSchool();
        springfieldSchool.listInformation();
        springfieldSchool.takeATour();

    }

    @Override
    public void giveQuote() {
        System.out.println("Famous Quote: \"Science has it all.\"");
    }

    public void skinnerFood() {
        ConsumerGood skinnerFood = ConsumerGood.BURGER;
        favoriteFood(skinnerFood);

    }

    public void skinnerTransport() {
        PersonalTransport skinnerTransport = PersonalTransport.SKINNERCAR;
        personalTransport(skinnerTransport);
    }
}
